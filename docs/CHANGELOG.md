## [2.0.0](https://github.com/kennedykori/jutils/compare/v1.2.0...v2.0.0) (2024-01-23)


### ⚠ BREAKING CHANGES

* change base package name from `com.kori_47.utils` to `io.github.kennedykori.utils`.

This change has been necessitated by the
[shutdown of Bintray](https://jfrog.com/blog/into-the-sunset-bintray-jcenter-gocenter-and-chartcenter/).
As such, the project will be migrating to Maven Central as the primary
hosting platform for the project binaries. Maven Central is a more
stable hosting service. Hopefully, this will result in a better and
more reliable experience.

A change of the base package name is a breaking change and will result in a new major release.

__Migrate from v1.x.x to v2.x.x__

Change the import statement as follows:

```diff
-import static com.kori_47.utils.ObjectUtils.*;
+import static io.github.kennedykori.utils.ObjectUtils.*;
```

That's it. The library API remains the same.
* change base package name

A change of the base package name is a breaking change and should
result in a new major release.

### Features

* modularize the project ([#9](https://github.com/kennedykori/jutils/issues/9)) ([c2714b8](https://github.com/kennedykori/jutils/commit/c2714b8d8b783e52925ba50124dc98054988b447))
* modularize the project ([#9](https://github.com/kennedykori/jutils/issues/9)) ([1e3d324](https://github.com/kennedykori/jutils/commit/1e3d324f75a0d3d1fa175209fd5c960180088472))


### Refactors

* change project base package name ([#7](https://github.com/kennedykori/jutils/issues/7)) ([9762c8f](https://github.com/kennedykori/jutils/commit/9762c8fa4f18ecdd9dadc0be6420f7f0c37ab4ac)), closes [#13](https://github.com/kennedykori/jutils/issues/13)
* change project base package name ([#7](https://github.com/kennedykori/jutils/issues/7)) ([aad7ca9](https://github.com/kennedykori/jutils/commit/aad7ca907739456f3ceae1a3b86e02f70c63735b))
* remove unnecessary final modifiers ([#10](https://github.com/kennedykori/jutils/issues/10)) ([7e2bd4b](https://github.com/kennedykori/jutils/commit/7e2bd4bf9cb42311cd5972283975133542e256c7))
* remove unnecessary final modifiers ([#10](https://github.com/kennedykori/jutils/issues/10)) ([13df263](https://github.com/kennedykori/jutils/commit/13df263c2bac7d651a205a552695159a1293c56c))
* upgrade Gradle to v8.5 ([#5](https://github.com/kennedykori/jutils/issues/5)) ([6e0ff81](https://github.com/kennedykori/jutils/commit/6e0ff813369de6d0c0f540c2501dbf298d880dd7))

## [2.0.0-dev.1](https://github.com/kennedykori/jutils/compare/v1.2.0...v2.0.0-dev.1) (2024-01-13)


### ⚠ BREAKING CHANGES

* change base package name from `com.kori_47.utils` to `io.github.kennedykori.utils`.

This change has been necessitated by the
[shutdown of Bintray](https://jfrog.com/blog/into-the-sunset-bintray-jcenter-gocenter-and-chartcenter/).
As such, the project will be migrating to Maven Central as the primary
hosting platform for the project binaries. Maven Central is a more
stable hosting service. Hopefully, this will result in a better and
more reliable experience.

A change of the base package name is a breaking change and will result in a new major release.

__Migrate from v1.x.x to v2.x.x__

Change the import statement as follows:

```diff
-import static com.kori_47.utils.ObjectUtils.*;
+import static io.github.kennedykori.utils.ObjectUtils.*;
```

That's it. The library API remains the same.
* change base package name

A change of the base package name is a breaking change and should
result in a new major release.

### Features

* modularize the project ([#9](https://github.com/kennedykori/jutils/issues/9)) ([c2714b8](https://github.com/kennedykori/jutils/commit/c2714b8d8b783e52925ba50124dc98054988b447))
* modularize the project ([#9](https://github.com/kennedykori/jutils/issues/9)) ([1e3d324](https://github.com/kennedykori/jutils/commit/1e3d324f75a0d3d1fa175209fd5c960180088472))


### Refactors

* change project base package name ([#7](https://github.com/kennedykori/jutils/issues/7)) ([9762c8f](https://github.com/kennedykori/jutils/commit/9762c8fa4f18ecdd9dadc0be6420f7f0c37ab4ac)), closes [#13](https://github.com/kennedykori/jutils/issues/13)
* change project base package name ([#7](https://github.com/kennedykori/jutils/issues/7)) ([aad7ca9](https://github.com/kennedykori/jutils/commit/aad7ca907739456f3ceae1a3b86e02f70c63735b))
* remove unnecessary final modifiers ([#10](https://github.com/kennedykori/jutils/issues/10)) ([7e2bd4b](https://github.com/kennedykori/jutils/commit/7e2bd4bf9cb42311cd5972283975133542e256c7))
* remove unnecessary final modifiers ([#10](https://github.com/kennedykori/jutils/issues/10)) ([13df263](https://github.com/kennedykori/jutils/commit/13df263c2bac7d651a205a552695159a1293c56c))
* upgrade Gradle to v8.5 ([#5](https://github.com/kennedykori/jutils/issues/5)) ([6e0ff81](https://github.com/kennedykori/jutils/commit/6e0ff813369de6d0c0f540c2501dbf298d880dd7))
