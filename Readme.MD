Kotlin/JS minimal console app
=============================
Minimal Kotlin/JS console application
Full article: https://medium.com/@ybznek/kotlin-js-minimal-console-app-b43b126f35b0

Build:
-----
```
./gradlew kotlinUpgradeYarnLock
./gradlew jsNodeProductionLibraryDistribution
cd build/dist/js/productionLibrary/ && npm install
```
Execute:
--------
```
node ./build/dist/js/productionLibrary/kotlin-js-console-app.js long1 a b c long2
```