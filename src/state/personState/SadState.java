package state.personState;

public class SadState extends State{
    @Override
    void cry() {
        System.out.println(" crys sadly.");
    }

    @Override
    void smile() {
        System.out.println(" smiles sadly.");
    }
}
