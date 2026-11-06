ZILFERCUT — ANDROID STARTER
===========================

This is the first Android Studio project foundation for ZILFERCUT.
It is NOT yet a complete video editor and does not export edited videos.

OPENING THE PROJECT
1. Install Android Studio (stable version).
2. Extract this ZIP.
3. Android Studio > Open > select the ZILFERCUT_Android_Starter folder.
4. Allow Gradle sync to finish.
5. Connect an Android phone with USB debugging enabled, or use an emulator.
6. Press Run.

CURRENT FOUNDATION
- Native Android project using Kotlin + Jetpack Compose.
- Initial dark/cyan ZILFERCUT home screen.
- New Project entry point placeholder.
- Settings dialog placeholder.
- Media3 dependencies included for the upcoming media pipeline.

DEVELOPMENT ROADMAP
Milestone 1: Media picker, project model, preview playback, trim and save project.
Milestone 2: Multi-track timeline, audio, voice-over, split, mute, crop and aspect ratios.
Milestone 3: Text, keyframes, stickers, overlays, masks, transitions, filters and effects.
Milestone 4: Export pipeline, device capability checks, resolution/FPS presets and end card.
Milestone 5: Localization (10 languages), themes, accessibility and performance tuning.
Milestone 6: Desktop edition using a shared project format and compatible editing core.

IMPORTANT
- 4K and high-FPS export must be enabled only when the source, device decoder/encoder,
  thermal limits and available storage support it.
- The THEME folder is intentionally prepared for your own 9:16 sticker/background assets.
- Add images into the matching folders; keep filenames simple (letters, numbers, hyphens).
- The final logo artwork should be supplied as a transparent PNG or SVG for clean rendering.

PACKAGE
Application ID: com.zilfercut.app
Version: 0.1.0 (starter)
Minimum Android: 8.0 (API 26)

GITHUB ACTIONS — APK BUILD
==========================
The project includes .github/workflows/android-build.yml.

HOW TO BUILD YOUR APK ON GITHUB
1. Create a new GitHub repository.
2. Extract this ZIP and upload the CONTENTS of the project folder.
   IMPORTANT: include the hidden .github folder.
3. Commit the files to the main or master branch.
4. Open the repository's Actions tab.
5. Select "Build ZILFERCUT APK" and click "Run workflow" if needed.
6. Wait for the build job to finish successfully.
7. Open the completed run and download the "ZILFERCUT-debug-APK" artifact.
8. Extract the downloaded artifact ZIP; it contains app-debug.apk.
9. Transfer app-debug.apk to your Android phone and install it.

BUILD NOTES
- This workflow creates a DEBUG APK for testing, not a signed Play Store release.
- A signed release build requires a private keystore and GitHub Actions secrets.
- Never commit your keystore or signing passwords to a public repository.
