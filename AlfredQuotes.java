import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello, %s. Lovely to see you.", name);
    }


    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "Current date is:" + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
    if (conversation.contains("Alexis")) {
        return "Right away, sir. She certainly isn't sophisticated enough for that.";
    } else if (conversation.contains("Alfred")) {
        return "At your service. As you wish, naturally.";
    } else {
        return "Right. And with that I shall retire.";
    }
    }

    public String respondBeforeAlfred(String conversation) {
    if (conversation.contains("Alfred")) {
        return "Yes sure he will know were it, because he was the last person I saw with it";
    } else if (conversation.contains("Alexis")) {
        return "I don't think she can help find your yo-yo";
    } else {
        return "Check in your pocket, it is surely in";
    }
    }
	
    
    // NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

