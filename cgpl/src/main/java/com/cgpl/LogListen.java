package com.cgpl;

import com.cgpl.logGrammar.LogBaseListener;
import com.cgpl.logGrammar.LogParser;
import com.cgpl.log.LogEntry;
import com.cgpl.log.LogLevel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

public class LogListen extends LogBaseListener{
    private static final DateTimeFormatter DEFAULT_DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss", Locale.ENGLISH);

    private List<LogEntry> entries = new ArrayList<>();
    private LogEntry currentEntry;

    @Override
    public void enterEntry(LogParser.EntryContext ctx) {
        this.currentEntry = new LogEntry();
    }
    
    @Override
    public void exitEntry(LogParser.EntryContext ctx) {
        this.entries.add(this.currentEntry);
    }

    @Override
    public void enterTimestamp(LogParser.TimestampContext ctx) {
        this.currentEntry.setTimestamp(LocalDateTime.parse(ctx.getText(), DEFAULT_DATETIME_FORMATTER));
    }

    @Override
    public void enterMessage(LogParser.MessageContext ctx) {
        this.currentEntry.setMessage(ctx.getText());
    }

    @Override
    public void enterLevel(LogParser.LevelContext ctx) {
        String level = ctx.getText();
        this.currentEntry.setLevel(LogLevel.valueOf(level));
    }

    public List<LogEntry> getEntries() {
        return this.entries;
    }
}