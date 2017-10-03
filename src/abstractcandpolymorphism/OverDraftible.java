package abstractcandpolymorphism;

public interface OverDraftible {
public default void play(){
	System.out.println("Playing in playgraound");
}
}
