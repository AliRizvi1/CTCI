package com.company;

import com.sun.corba.se.impl.orbutil.graph.Graph;
import com.sun.corba.se.impl.orbutil.graph.Node;
import java.util.*;

public class TreesAndGraphs {
    enum State {Unvisited, Visited, Visiting;}

    boolean search(Graph g, Node start, Node end) {
        if (start == end) return true;

        //Operates as a Queue:
        LinkedList<Node> q = new LinkedList<>();

//        for (Node u : g.getNodes())
//            u.state = state.Univisted;
//    }
        return false;
    }
}
