package com.company.quoteswordsaremagic.controller;

import com.company.quoteswordsaremagic.model.MagicBall;
import com.company.quoteswordsaremagic.model.Quote;
import com.company.quoteswordsaremagic.model.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class QuotesWordsMagicController {

    Random rand = new Random();

//    Mock Database, GET and a json object
    private static List<Quote> quoteList = new ArrayList<>(Arrays.asList(
//           https://blog.hubspot.com/sales/famous-quotes
            new Quote(1,"Walt Disney","The way to get started is to quit talking and begin doing."),
            new Quote(2, "Abraham Lincoln", "In the end, it's not the years in your life that count. It's the life in your years."),
            new Quote(3, "Thomas A. Edison", "Many of life's failures are people who did not realize how close they were to success when they gave up."),
            new Quote(4, "Tony Robbins", "The only impossible journey is the one you never begin."),
            new Quote(5, "Mae West", "You only live once, but if you do it right, once is enough."),
            new Quote(6, "James Cameron", "If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success."),
            new Quote(7, "Henry David Thoreau",  "Go confidently in the direction of your dreams! Live the life you've imagined."),
            new Quote(8, "Charles Dickens", "Life is made of ever so many partings welded together."),
            new Quote(9, "Thomas Jefferson", "I find that the harder I work, the more luck I seem to have." ),
            new Quote(10, "Steve Jobs", "If you really look closely, most overnight successes took a long time."),
            new Quote(11, "FitzWilliam Darcy", "My good opinion once lost, is lost forever.")
    ));

    private static List<Definition> definitionList = new ArrayList<>(Arrays.asList(
//            https://www.oxfordlearnersdictionaries.com/
            new Definition(1, "Dichotomy", "a division or contrast between two groups or things that are completely opposite to and different from each other"),
            new Definition(2, "Erstwhile","former; that until recently was the type of person or thing described but is not any more" ),
            new Definition(3, "Plausible", "of an excuse or explanation) reasonable and likely to be true"),
            new Definition(4, "Snafu", "a situation in which nothing happens as planned"),
            new Definition(5, "Pandemonium", "a situation in which there is a lot of noise and activity with a great lack of order, especially because people are feeling angry or frightened"),
            new Definition(6, "Cajole", "to make somebody do something by talking to them and being very nice to them"),
            new Definition(7, "Bard", "a person who writes poems"),
            new Definition(8, "Adage", "a well-known phrase expressing a general truth about people or the world"),
            new Definition(9, "Epoch", "a period of time in history, especially one during which important events or changes happen"),
            new Definition(10, "Tome", "a large, heavy book, especially one dealing with a serious topic")
    ));

    private static List<String> magicBallList = new ArrayList<>(Arrays.asList(
            "Very doubtful",
            "Concentrate and ask again",
            "Cannot predict now",
            "Outlook good",
            "Without a doubt",
            "Yes",
            "Ask again later"
    ));

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
        public Quote getQuotes() {
        int quoteIndex;
        quoteIndex = rand.nextInt(quoteList.size());
        Quote selectQuotes = quoteList.get(quoteIndex);
//        System.out.println("random" + selectQuotes);

        return selectQuotes;
        }

        @RequestMapping(value = "/word", method = RequestMethod.GET)
        @ResponseStatus(HttpStatus.OK)
        public Definition getWordDefinition() {
        int wordIndex = rand.nextInt(definitionList.size());
        Definition selectDefinition = definitionList.get(wordIndex);

        return selectDefinition;
        }

        int magicBallCounter = +1;

        @RequestMapping(value = "/magic", method = RequestMethod.POST)
        @ResponseStatus(HttpStatus.CREATED)
        public MagicBall getMagicBall(@RequestBody MagicBall answer) {
            int randomMagicIndex;
            randomMagicIndex = rand.nextInt(magicBallList.size());
            String selectMagicAnswer;
            selectMagicAnswer = magicBallList.get(randomMagicIndex);
            answer.setAnswer(selectMagicAnswer);
            answer.setId(magicBallCounter);

            return answer;
        }


}
