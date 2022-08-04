This example demonstrates the use of:
- Constructor Injection: Use @Inject annotation before constructor keyword in all the classes.

- Dagger2 Modules: Used when you can't add @Inject annotation in the
 class constructors (i.e. third party library classes.)

- Working with interfaces: Interfaces don't have constructors so need to create a concrete class

- Field injection: When we have multiple dependencies to inject it's better to use field injection

- State of a module: With primary constructor parameters

- The application class: Instantiate a component in the app class and use it in different activities.

- Singletons: Dagger2 constructs an object everytime the app is rotated
 or injected in different activities. To avoid that we can use @Singleton annotation.
 Annotate a class and related component with @Singleton annotation.


Dagger2 Annotations:
1) @Module: This annotation is used over the class which is used to construct objects
and provide the dependencies.

2) @Provides: This is used over the method in the module class that will return the object.

3) @Inject: This is used over the fields, constructor, or method and indicate that
dependencies are requested.

4) @Component: This is used over a component interface which acts as a bridge between
@Module and @Inject. (Module class doesn't provide dependency directly
to requesting class, it uses component interface)

5) @Singleton: This is used to indicate only a single instance of dependency object is created.

6) @Binds: To tell the dagger which implementation an interface should have.
