package com.zilfercut.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.VideoLibrary
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Ink = Color(0xFF050A12)
private val Panel = Color(0xFF0D1725)
private val Cyan = Color(0xFF00E5FF)
private val Mint = Color(0xFF00D6A0)
private val White = Color(0xFFF4F8FC)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { ZilferCutApp() }
    }
}

@Composable
fun ZilferCutApp() {
    var showSettings by remember { mutableStateOf(false) }
    MaterialTheme(colorScheme = darkColorScheme(
        background = Ink, surface = Panel, primary = Cyan,
        onBackground = White, onSurface = White
    )) {
        Box(
            Modifier.fillMaxSize().background(
                Brush.verticalGradient(listOf(Color(0xFF071421), Ink, Color(0xFF020509)))
            )
        ) {
            Column(
                Modifier.fillMaxSize().statusBarsPadding().padding(horizontal = 22.dp, vertical = 18.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                    Column(Modifier.weight(1f)) {
                        Text("ZILFER", color = White, fontSize = 25.sp, fontWeight = FontWeight.Black, letterSpacing = 3.sp)
                        Text("CUT  •  DREAM. EDIT. INSPIRE.", color = Cyan, fontSize = 10.sp, letterSpacing = 2.sp)
                    }
                    IconButton(onClick = { showSettings = true }) {
                        Icon(Icons.Default.Settings, contentDescription = "Settings", tint = White)
                    }
                }

                Spacer(Modifier.height(30.dp))
                Box(
                    Modifier.fillMaxWidth().height(178.dp)
                        .border(1.dp, Cyan.copy(alpha = .45f), RoundedCornerShape(24.dp))
                        .background(Brush.linearGradient(listOf(Color(0xFF102E43), Color(0xFF07101D))), RoundedCornerShape(24.dp))
                        .padding(20.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Column {
                        Text("CREATE", color = White, fontSize = 13.sp, letterSpacing = 4.sp, fontWeight = FontWeight.Bold)
                        Text("Beyond the frame.", color = Cyan, fontSize = 27.sp, fontWeight = FontWeight.ExtraBold)
                        Spacer(Modifier.height(8.dp))
                        Text("Your story. Your vision. Your edit.", color = White.copy(alpha = .72f), fontSize = 12.sp)
                    }
                }

                Spacer(Modifier.height(22.dp))
                Button(
                    onClick = { /* Media picker and editor flow are implemented in the next milestone. */ },
                    modifier = Modifier.fillMaxWidth().height(62.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Cyan, contentColor = Color(0xFF00121A))
                ) {
                    Icon(Icons.Default.Add, contentDescription = null)
                    Spacer(Modifier.width(10.dp))
                    Text("NEW PROJECT", fontSize = 16.sp, fontWeight = FontWeight.Black, letterSpacing = 1.sp)
                }

                Spacer(Modifier.height(28.dp))
                Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                    Text("MY PROJECTS", color = White, fontWeight = FontWeight.Bold, letterSpacing = 1.5.sp)
                    Spacer(Modifier.weight(1f))
                    Text("RECENT", color = Cyan, fontSize = 11.sp)
                }
                Spacer(Modifier.height(12.dp))
                Box(
                    Modifier.fillMaxWidth().weight(1f)
                        .border(1.dp, Color(0xFF24394D), RoundedCornerShape(22.dp))
                        .background(Panel.copy(alpha = .8f), RoundedCornerShape(22.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(Icons.Default.VideoLibrary, contentDescription = null, tint = Cyan, modifier = Modifier.size(42.dp))
                        Spacer(Modifier.height(12.dp))
                        Text("No projects yet", color = White, fontWeight = FontWeight.SemiBold)
                        Text("Start a new project and your edits will appear here.", color = White.copy(alpha = .55f), fontSize = 11.sp)
                    }
                }
                Spacer(Modifier.height(12.dp))
                Text("Z I L F E R C U T     •     CREATIVE STUDIO", color = White.copy(alpha = .38f), fontSize = 9.sp, letterSpacing = 1.5.sp)
            }

            if (showSettings) {
                AlertDialog(
                    onDismissRequest = { showSettings = false },
                    title = { Text("Settings") },
                    text = { Text("Language, appearance, export defaults and logo options will be added in the settings milestone.") },
                    confirmButton = { TextButton(onClick = { showSettings = false }) { Text("CLOSE") } },
                    containerColor = Panel,
                    titleContentColor = White,
                    textContentColor = White.copy(alpha = .75f)
                )
            }
        }
    }
}
