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
