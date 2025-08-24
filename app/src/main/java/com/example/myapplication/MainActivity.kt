package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                TampilanDataMahasiswa(
                    nim = "245150400111056",
                    nama = "Darryl M. Immanuel Panggabean"
                )
            }
        }
    }
}

@Composable
fun TampilanDataMahasiswa(nim: String, nama: String, modifier: Modifier = Modifier) {
    // Column digunakan untuk menyusun elemen secara vertikal (atas ke bawah)
    Column(
        modifier = modifier.fillMaxSize(), // Mengisi seluruh layar
        verticalArrangement = Arrangement.Center, // Menengahkan secara vertikal
        horizontalAlignment = Alignment.CenterHorizontally // Menengahkan secara horizontal
    ) {
        // Teks untuk menampilkan NIM
        Text(
            text = "NIM: $nim",
            fontSize = 24.sp // Ukuran font
        )
        // Teks untuk menampilkan Nama
        Text(
            text = "Nama: $nama",
            fontSize = 18.sp // Ukuran font
        )
    }
}

// Untuk menampilkan fungsi TampilanDataMahasiswa di panel preview
@Preview(showBackground = true)
@Composable
fun TampilanDataMahasiswaPreview() {
    MyApplicationTheme {
        TampilanDataMahasiswa(nim = "245150400111056", nama = "Darryl M. Immanuel Panggabean")
    }
}