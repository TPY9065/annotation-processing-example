# Description
This repository shows how to create a custom annotation processing with
java annotation processing API, which support generate a builder class with `@BuilderProperty`

## Structure
```
annotation-processor // module which contains the processor and @BuilderProperty
    |- BuilderProcessor.java // definition of the processor
    |- BuilderProperty.java // definition of the annotation
annotation-user // module which act as the annotation user
    |- Person // POJO class annotated with @BuilderProperty on its setter
```

## Expected output
The `PersonBuilder` file should be located in `annotation-user/target/classes/tse/lawrence` after the project build.
The `PersonBuilder` source file should show as follows
```
package tse.lawrence;

public class PersonBuilder
{

    private Person object = new Person();

    public Person build()
    {
        return this.object;
    }

    public PersonBuilder setName(String value)
    {
        this.object.setName(value);
        return this;
    }

    public PersonBuilder setAge(int value)
    {
        this.object.setAge(value);
        return this;
    }
    
}
```

