package ca.baosiek.patricia;

import ca.baosiek.patricia.analysers.StringAnalyser;
import ca.baosiek.patricia.tries.PATRICIATrie;

public class Run {
    public static void main(String[] args) {
        StringAnalyser analyser = new StringAnalyser();
        PATRICIATrie<Integer> patriciaTrie = new PATRICIATrie<>(analyser);
        String[] elements = {"A", "B", "C", "D", "E", "F", "G", "AB", "BA"};
        // insert and show node structure at time of insert
        for (String element : elements) {
            patriciaTrie.put(element, 1);
            System.out.println(patriciaTrie.getNearestKey(element, analyser.lengthInBits(element)));
        }
        // after all inserts, run through node list and print out tree information
        System.out.println("---------------------------------------------------------------");
        // print out special "root" node that is the empty string
        System.out.println(patriciaTrie.getNearestKey("", analyser.lengthInBits("")));
        for (String element : elements) {
            System.out.println(patriciaTrie.getNearestKey(element, analyser.lengthInBits(element)));
        }
    }
}
