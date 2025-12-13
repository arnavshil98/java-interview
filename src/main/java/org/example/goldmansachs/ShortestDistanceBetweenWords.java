package org.example.goldmansachs;

public class ShortestDistanceBetweenWords {

    public static int shortestDistance(String sentence, String word1, String word2){
        String[] sentenceArr = sentence.split(" ");
        int minDist = Integer.MAX_VALUE;
        int i=0;
        int j= sentenceArr.length-1;
        // keeping history of indices
        int word1PreviousIndex = sentenceArr.length;
        int word2PreviousIndex = -1;
        while(i<sentenceArr.length && j>=0){
            while(i<sentenceArr.length && !sentenceArr[i].equals(word1)){
                i++;
            }
            System.out.println(word1+ " index: " + i);

            while(j>=0 && !sentenceArr[j].equals(word2)){
                j--;
            }
            System.out.println(word2+ " index: " + j);

            // calculate minDist
            // in any case if either if the indices cross the boundary condition then
            // use the last used index of the particular word
            word1PreviousIndex = (i==sentenceArr.length)? word1PreviousIndex : i;
            word2PreviousIndex = (j==-1)? word2PreviousIndex : j;
            int currentDist = Math.abs(word2PreviousIndex-word1PreviousIndex)-1; // -1 for compensating the actual words between the indices;
            minDist = Math.min(currentDist,minDist);
            i++;
            j--;
        }

        return minDist;
    }
    public static void main(String[] args) {
        String sentence = "the quick the fox quick brown fox"; // "geeks for geeks contribute practice";//
        String word1 = "quick"; //"geeks";
        String word2 = "fox"; //"practice";
        int dist = shortestDistance(sentence,word1,word2);
        System.out.println(dist);
    }
}
