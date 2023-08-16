package simulation;

public class Feedback {
    public Interaction interaction;
    public Agent giver;
    public double payoff;
    
    public Feedback(Interaction interaction, Agent giver, double payoff){
        this.interaction = interaction;
        this.giver = giver;
        this.payoff = payoff;
    }
}
