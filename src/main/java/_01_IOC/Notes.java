package _01_IOC;

public class Notes {

    // IOC(Invertion Of Control); The approach of outsourcing the construction and management of objects.

    // Bu yaklaşımda ; new anahtar kelimesi kullanılmaz.

   /*

    Spring Container


   -- Create and manage objects ( Inversion Of Control)
   -- Inject object's dependencies ( Dependency Injection)




 -- There is three ways of configuring the Spring Container.


1.     XML Configuration File ( legacy, but most legacy apps still use this)
2.     Java Annotations (modern)
3.     Java Source(modern)


    -- Spring Development Process

       1.    Configure your Spring Beans
       2.    Create Spring Container
              * Spring Container is generically known as Application Context .
              * Specialized Implementations
                     * ClassPathXMLApplicationContext
                     * AnnotationConfigApplicationContext
                     * GenericWebApplicationContext

       3.    Retrieve Beans from Spring Container

       !! Application Context xml dosyası resource altında bulunmalıdır.

   -- What is the Spring Bean ?

       1. A "Spring Bean" is simply a Java object.
       2. When Java objects are created by the Spring Container, then Spring refers to them as "Spring Beans".
       3. Spring Beans are created from normal Java classes .... just like Java objects.
    */
}
