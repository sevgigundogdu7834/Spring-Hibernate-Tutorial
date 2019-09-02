package _09_Bean_scope;

/**
 *
 *    -- Bean Scopes
 *       1. Scope refers to the lifecycle of a bean
 *       2. How long does the bean live ?
 *       3. How many instances are created?
 *       4. How is the bean shared?
 *
 *       -- Default Scope : Singleton
 *
 *       -- What is a Singleton?
 *
 *       1. Spring Container creates only one instance of the bean, by default
 *       2. It is cached in memory
 *       3. All requests for the bean
 *            4. will return a SHARED reference to the SAME bean
 *
 *       example:  Coach theCoach= context.getBean("myCoach",Coach.class); ------------>      ----------------
 *
 *                                                                                              TrackCoach
 *                 Coach alphaCoach= context.getBean("myCoach",Coach.class); ---------->     ------------------
 *
 *           <bean id="myFortuneService"
 *           class="_07_Injecting_Literal_Value.HappyFortuneService"
 *           scope="singleton"/>
 *
 *         </beans>
 *
 *      *Scope             *Description
 *
 *      Singleton          Create a single shared instance of the bean.Default Scope.
 *      Prototype          Creates a new bean instance for each container request.
 *      Request            Scoped to an HTTP web request.Only used for web apps.
 *      Session            Scoped to an HTTP web session. Only used for web apps.
 *      Global-Session     Scoped to a global HTTP web session. Only used for web apps.
 *
 *
 *      ------ Prototype Scope: new object for each request
 *
 *      example: Coach theCoach= context.getBean("myCoach",Coach.class); ------------>      TrackCoach
 *  *
 *  *
 *  *            Coach alphaCoach= context.getBean("myCoach",Coach.class); ---------->       TrackCoach
 *
 *
 */
public class Notes {



}
