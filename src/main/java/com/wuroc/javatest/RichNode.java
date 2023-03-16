package com.wuroc.javatest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RichNode {
    public List<RichNode> nodeList;
    public String value;

    public static void main(String[] args) {
        RichNode richNode = new RichNode();
        List<String> richNodeValueList = ExtractRichNodeValue(richNode);
        System.out.println(richNodeValueList);
    }

    private static List<String> ExtractRichNodeValue(RichNode node) {
        List<String> valueList = new ArrayList<>();
        Stack<RichNode> richNodes = new Stack<>();
        richNodes.push(node);

        while (!richNodes.isEmpty()) {
            RichNode currNod = richNodes.pop();
            if (currNod.value != null) {
                valueList.add(currNod.value);
            }
            if (currNod.nodeList != null) {
                for (RichNode rich : currNod.nodeList) {
                    richNodes.push(rich);
                }
            }
        }
        return valueList;
    }
}
