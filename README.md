# RabbitMQ Sandbox

__The point of this project is to provide a space where you can remove yourself from all frameworks and experiment with the Java client for [RabbitMQ](https://www.rabbitmq.com) for the sake of tinkering about.__

## Setup Steps

Download and install [Java](http://openjdk.java.net/install/) & [Maven](https://maven.apache.org/install.html)

Download and install the latest RabbitMQ:

  - Windows: [With installer (recommended)](https://www.rabbitmq.com/install-windows.html) | [Manual](https://www.rabbitmq.com/install-windows-manual.html)
  - Linux / Unix: [Debian, Ubuntu](https://www.rabbitmq.com/install-debian.html) | [RHEL, CentOS, Fedora](https://www.rabbitmq.com/install-rpm.html) | [Generic Unix](https://www.rabbitmq.com/install-generic-unix.html) | [Solaris](https://www.rabbitmq.com/install-solaris.html)
  - Mac OS X: [Standalone](https://www.rabbitmq.com/install-standalone-mac.html) | [Generic Unix](https://www.rabbitmq.com/install-generic-unix.html) | [Homebrew](https://www.rabbitmq.com/install-homebrew.html)

Ensure that the rabbitmq server is running by checking that the process is attached to the default port using this command:

```
$ lsof -i :15672
COMMAND   PID      USER   FD   TYPE            DEVICE SIZE/OFF NODE NAME
beam.smp 6696 daveloper   69u  IPv4 0x8e8b84ea1fd6e2f      0t0  TCP *:15672 (LISTEN)
```

_^^^ (assumes *nix, use `netstat` for windows)_

The last setup step is to build this application using [maven](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html). To do so, run the following command: `mvn install`

Now you can run the jar and execute the program: `java -jar target/RabbitMQSandbox-1.0-SNAPSHOT.jar`

Using this app as your sandbox environment, run through the [RabbitMQ tutorials](https://www.rabbitmq.com/getstarted.html) to get your hands dirty.
