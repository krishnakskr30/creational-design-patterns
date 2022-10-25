package singleton;

public class Client {

    public static void main(String[] args) {
        EagerRegistry eagerRegistry = EagerRegistry.getInstance();
        EagerRegistry eagerRegistry1 = EagerRegistry.getInstance();
        System.out.println(eagerRegistry);
        System.out.println(eagerRegistry1);
        System.out.println(eagerRegistry == eagerRegistry1);

        LazyRegistryWithDCL lazySingleTon = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazySingleTon1 = LazyRegistryWithDCL.getInstance();
        System.out.println(lazySingleTon1 == lazySingleTon);

        LazyRegistryIODH lazyRegistryIODH = LazyRegistryIODH.getInstance();
        LazyRegistryIODH lazyRegistryIODH1 = LazyRegistryIODH.getInstance();
        System.out.println(lazyRegistryIODH == lazyRegistryIODH1);
    }

}
