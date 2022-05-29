package com.simplilearn.ReviewAnalyzer;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReviewAnalyzerApplicationTests {

    private ReviewAnalyzerApplication analyser = new ReviewAnalyzerApplication();
    @Test	 
    public void testWordCount() {     	 
   	 assertEquals(7,analyser.getWordCount("Train to win in the digital economy"));	 
    }
}

