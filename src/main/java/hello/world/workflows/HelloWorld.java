package hello.world.workflows;

import io.infinitic.annotations.Name;

@Name(name = "HelloWorld")
public interface HelloWorld {
    String greet(String name);
}