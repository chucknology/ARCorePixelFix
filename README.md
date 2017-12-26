# ARCorePixelFix
Emergency fixes for apps built with ARCore Preview 2 running on Pixel devices with AR Stickers installed.

See source for usage.

---

___Who's this for?___

Developers of ARCore apps.

___Who's affected?___

Pixel users and developers of ARCore apps.

___What's the problem?___

Camera is black when apps using ARCore Preview 2 are launched on Pixel devices.

___What's the cause?___

Older ARCore service library on Play Store for AR Stickers.

___What's the fix?___

Suspend and resume the app.

___What does this code do?___

Suspend and resume the app.

___What's the solution?___

Updated ARCore Play Store release.

___What's going on?___

ARCore Preview 2 SDKs have been released 2017.12.15 - the same week AR Stickers is made available exclusively for Pixel devices. The ARCore service library is now also available via Play Store for Pixel devices to support AR Stickers. The version of the ARCore service library available via Play Store (0.91.171127093) is older than the version available from the developers site accompanying ARCore Preview 2 (0.91.171204143).

When an app built with ARCore Preview 2 is launched on devices with the Play Store ARCore service library installed, the app will not receive camera frames at startup and the viewfinder component will show black. The log will show an AR_NOT_READY exception being thrown by the native library.

Using the OS task switcher (square button) to pause and resume the application will successfully connect the camera. This behavior has been observed in apps built using ARCore Preview 2 with Unity 2017.3.0f2 running on Android Oreo 8.1 with ARCore 171127093 (Play Store release).

**This release is dedicated to Ryan Thomas.**

Imagine a license where you credit me unless you don't have to.
