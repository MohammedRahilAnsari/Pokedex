package com.example.pokedex


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var adapter: PokemonAdapter? = null
    var listofpokemon = ArrayList<pokemon>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //loading pokemons

        listofpokemon.apply {
            add(
                pokemon(
                    "Pikachu",
                    "Pika” is from pikapika, which means to sparkle or glitter. “Chu” is from chuchu, the Japanese word for the sound mice make. So put them together, and you get “Pikachu,” AKA “Sparkle Mouse Noise.",
                    R.drawable.pikachu
                )
            )
            add(
                pokemon(
                    "Bulbasaur",
                    "Bulbasaur (Japanese: フシギダネ Fushigidane) is a dual-type Grass/Poison Pokémon introduced in Generation I.",
                    R.drawable.bulbasaur
                )
            )
            add(
                pokemon(
                    "Charmander",
                    "Charmander (Japanese: ヒトカゲ Hitokage) is a Fire-type Pokémon introduced in Generation I.",
                    R.drawable.charmander
                )
            )
            add(
                pokemon(
                    "Squirtle",
                    "Squirtle (Japanese: ゼニガメ Zenigame) is a Water-type Pokémon introduced in Generation I.",
                    R.drawable.squirtle
                )
            )
            add(
                pokemon(
                    "Snorlax",
                    "Snorlax (Japanese: カビゴン Kabigon) is a Normal-type Pokémon introduced in Generation I. It evolves from Munchlax when leveled up with high friendship.",
                    R.drawable.snorlax
                )
            )
            add(
                pokemon(
                    "Eevee",
                    "Eevee (Japanese: イーブイ Eievui) is a Normal-type Pokémon introduced in Generation I.",
                    R.drawable.eevee
                )
            )
            add(
                pokemon(
                    "Jigglypuff",
                "Jigglypuff (Japanese: プリン Purin) is a dual-type Normal/Fairy Pokémon introduced in Generation I.\n",
                    R.drawable.jigglypuff
                )
            )
            add(
                pokemon(
                    "Mewtwo",
                    "Mewtwo (Japanese: ミュウツー Mewtwo) is a Psychic-type Legendary Pokémon introduced in Generation I.",
                    R.drawable.mewtwo
                )
            )
            add(
                pokemon(
                    "Togepi",
                    "Togepi (Japanese: トゲピー Togepy) is a Fairy-type baby Pokémon introduced in Generation II.",
                    R.drawable.togepi
                )
            )
            add(
                pokemon(
                    "Meowth",
                "Meowth (Japanese: ニャース Nyarth) is a Normal-type Pokémon introduced in Generation I.",
                    R.drawable.meowth
                )
            )

        }
        adapter = PokemonAdapter(listofpokemon)
        binding.listItem.layoutManager =  LinearLayoutManager(this)
        binding.listItem.adapter = adapter
    }
}

