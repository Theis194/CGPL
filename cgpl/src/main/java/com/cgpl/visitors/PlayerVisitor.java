package com.cgpl.visitors;

import com.cgpl.CGPLBaseVisitor;
import com.cgpl.CGPLParser;
import com.cgpl.AST.expressions.Player;

public class PlayerVisitor extends CGPLBaseVisitor<Player> {
    @Override
    public Player visitPlayer(CGPLParser.PlayerContext ctx) {
        return new Player();
    }
}
