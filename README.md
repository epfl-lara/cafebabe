About
-----

Cafebabe is a tiny Scala library to generate JVM class files. It was originally
developed for the Compiler Construction course taught at EPFL. See
http://lara.epfl.ch/w/Teaching for more info.

The name Cafebabe comes from `0xCAFEBABE`, the
[magic number at the start of every JVM class file](https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.1).

The wiki contains some documentation.

Setup
-----

Releases for Scala 3 are published on Maven Central, under `ch.epfl.lara`. They are compiled
with Scala 3.9, and work with Scala 3.9 and later. Add the following to your project settings in
`build.sbt`, with the latest version:

```scala
libraryDependencies += "ch.epfl.lara" %% "cafebabe" % "<version>"
```
