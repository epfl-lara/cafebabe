About
-----

Cafebabe is a tiny Scala library to generate JVM class files. It was originally
developed for the Compiler Construction course taught at EPFL. See
http://lara.epfl.ch/w/Teaching for more info.

The wiki contains some documentation.

Setup
-----

Releases for Scala 3 are published on Maven Central, under `ch.epfl.lara`. They are compiled
with Scala 3.9, and work with Scala 3.9 and later. Add the following to your project settings in
`build.sbt`, with the latest version:

```scala
libraryDependencies += "ch.epfl.lara" %% "cafebabe" % "<version>"
```

The last release for Scala 2.10, 2.11 and 2.12 is `1.2`, under the same coordinates.
