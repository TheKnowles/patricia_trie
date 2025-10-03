package ca.baosiek.patricia;

import ca.baosiek.patricia.analysers.StringAnalyser;
import ca.baosiek.patricia.tries.PATRICIATrie;

public class Run {
    public static void main(String[] args) {
        StringAnalyser analyser = new StringAnalyser();
        PATRICIATrie<Integer> patriciaTrie = new PATRICIATrie<>(analyser);
        patriciaTrie.put("A", 1);
        patriciaTrie.put("B", 1);
        patriciaTrie.put("C", 1);
        patriciaTrie.put("D", 1);
        patriciaTrie.put("E", 1);
        patriciaTrie.put("F", 1);
        patriciaTrie.put("AB", 1);
        patriciaTrie.put("BA", 1);

        System.out.println(patriciaTrie.getNearestKey("AB", analyser.lengthInBits("AB")));
        System.out.println(patriciaTrie.getNearestKey("BA", analyser.lengthInBits("BA")));
        System.out.println(patriciaTrie.getNearestKey("D", analyser.lengthInBits("D")));
        System.out.println(patriciaTrie.getNearestKey("A", analyser.lengthInBits("A")));
        System.out.println(patriciaTrie.getNearestKey("B", analyser.lengthInBits("B")));
        System.out.println(patriciaTrie.getNearestKey("C", analyser.lengthInBits("C")));
    }
}
