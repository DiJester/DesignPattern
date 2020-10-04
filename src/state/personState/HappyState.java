package state.personState;

class HappyState extends State{
    @Override
    void cry() {
        System.out.println(" crys happily.");
    }

    @Override
    void smile() {
        System.out.println(" smiles happily.");
    }
}
