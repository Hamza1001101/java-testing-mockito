package twitterAPI;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class TwitterClientTest {
    
    ITweet tweet = mock(ITweet.class); 
    
    @Test
    public void twitterClientShouldCallGetMessageOnTweet() {
     
        TwitterClient twitterClient = new TwitterClient();

        // TODO configure the tweet message with Mockito to return a string
        when(tweet.getMessage()).thenReturn("Using mockito is great");
        
        // TODO call twitterClient.sendTweet with the mock
        twitterClient.sendTweet(tweet);
        
        // TODO verify that getMessage was called atLeastOnce()
        verify(tweet, atLeastOnce()).getMessage();
    }

}