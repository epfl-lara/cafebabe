Contributing
============

Releasing
---------

Releases are published to Maven Central by the [Release workflow](.github/workflows/release.yml):

1. Set `version` in `build.sbt`, and merge it. A version can't be published twice.
2. Run the workflow from the Actions tab ("Run workflow" on `main`), or with
   `gh workflow run release.yml -f version=v1.3.0`, giving the version with a leading `v`. It tests,
   signs and publishes that version to Maven Central, then tags the commit `v<version>` and creates
   the GitHub release, with generated notes and the JAR attached.

To check a release before it goes out, choose the mode `upload` instead: it only uploads the
artifacts to the [Central Portal](https://central.sonatype.com/publishing/deployments), to publish
or drop them there, and creates neither the tag nor the release.

Locally, `sbt publishSigned` signs the artifacts and stages them in `target/sona-staging`.
