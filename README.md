# react-native-native-profiler

## Getting started

`$ npm install react-native-native-profiler --save`

### Mostly automatic installation

`$ react-native link react-native-native-profiler`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-native-profiler` and add `NativeProfiler.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libNativeProfiler.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.reactlibrary.NativeProfilerPackage;` to the imports at the top of the file
  - Add `new NativeProfilerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-native-profiler'
  	project(':react-native-native-profiler').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-native-profiler/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-native-profiler')
  	```


## Usage
```javascript
import NativeProfiler from 'react-native-native-profiler';

// TODO: What to do with the module?
NativeProfiler;
```
