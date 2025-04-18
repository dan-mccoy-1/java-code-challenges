package com.danmccoy.codeChallenges;

import com.danmccoy.codeChallenges.challengesHard.RecursiveIntegerDigitsCount;
import com.danmccoy.codeChallenges.challengesHard.Regex;
import com.danmccoy.codeChallenges.challengesMedium.OddVsEvenIntegersSumDifference;
import com.danmccoy.codeChallenges.challengesVeryHard.EncryptDecrypt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeChallengesApplication {

	public static void main(String[] args) {
		// Run server
		SpringApplication.run(CodeChallengesApplication.class, args);

		// Run medium difficulty (edabit.com) challenges
		OddVsEvenIntegersSumDifference oddVsEvenIntegers = new OddVsEvenIntegersSumDifference();

		// Run hard-difficulty (edabit.com) challenges
		RecursiveIntegerDigitsCount recursiveIntegerDigitsCount = new RecursiveIntegerDigitsCount();
		Regex regex = new Regex();

		// Run very hard difficulty challenges
		EncryptDecrypt encodeDecode = new EncryptDecrypt();
	}

}
