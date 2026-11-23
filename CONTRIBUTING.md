Contributing
============

Releasing
---------

Releases are published to Maven Central by the
[Release workflow](.github/workflows/release.yml). Run it from the Actions tab ("Run workflow" on
`main`), or with `gh workflow run release.yml -f version=v1.3.0`, giving the version with a
leading `v`. It tags the current commit (the build takes its version from the tag, through
`git describe`), tests, signs and publishes that version, then pushes the tag and creates the
GitHub release, with generated notes and the JAR attached. A version can't be published twice.

To check a release before it goes out, choose the mode `upload`: it only uploads the artifacts to
the [Central Portal](https://central.sonatype.com/publishing/deployments), to publish or drop
them there, and pushes no tag.

Locally, `sbt publishSigned` signs the artifacts and stages them in `target/sona-staging`.
