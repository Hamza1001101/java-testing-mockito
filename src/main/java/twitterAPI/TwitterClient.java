package twitterAPI;

public class TwitterClient {
    
    public void sendTweet(ITweet tweet){
        String message= tweet.getMessage();

        System.out.println(message);
    }
}
