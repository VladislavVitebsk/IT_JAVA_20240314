package IT_JAVA_20240314;

public class SillyLittleMariam {
    public static void main(String[] args) {
        Girl mariam = new Girl("Mariam");
        System.out.println(mariam.toString());

        Girl noMariam = (Girl)mariam.clone();
        noMariam.setName("No Mariam");
        noMariam.setLazy(false);
        noMariam.setSilly(false);
        System.out.println(noMariam.toString());
    }
}
class Girl implements Cloneable{
    private String name;
    private boolean silly = true;
    private boolean little = true;
    private boolean lezy = true;
    public Girl

    @Override
    public Girl clone() {
        try {
            Girl clone = (Girl) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
