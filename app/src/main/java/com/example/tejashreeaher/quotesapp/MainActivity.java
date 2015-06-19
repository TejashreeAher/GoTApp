package com.example.tejashreeaher.quotesapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.tejashreeaher.database.DatabaseHandler;
import com.example.tejashreeaher.model.CharacterImage;
import com.example.tejashreeaher.model.Quote;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler dbHandler = new DatabaseHandler(this);
        addAllData(dbHandler);
        final int totalQuotes = dbHandler.getTotalQuotes();

        Button getQuoteButton = (Button) findViewById(R.id.getQuoteButton);
        getQuoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, QuoteActivity.class);
                intent.putExtra("totalQuotes", totalQuotes);
                startActivity(intent);
            }
        });
    }

    private void addAllData(DatabaseHandler dbHandler){
        dbHandler.addQuote(new Quote("Game of Thrones","Tyrion Lannister", "A mind needs books as a sword needs a whetstone, if it is to keep its edge."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","Never forget what you are, for surely the world will not. Make it your strength. Then it can never be your weakness. Armour yourself in it, and it will never be used to hurt you."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Petyr Baelish", "Chaos isn't a pit. Chaos is a ladder. Many who try to climb it fail and never get to try again. The fall breaks them. And some are given a chance to climb,but they refuse. They  cling to the realm or the gods or love. Illusions! Only the ladder is real. The climb is all there is!"));
        dbHandler.addQuote(new Quote("Game of Thrones", "Jaime Lannister", "There are no men like me, only me!"));
        dbHandler.addQuote(new Quote("Game of Thrones", "Jaime Lannister", "By what right does the wolf judge the lion? By what right!"));
        dbHandler.addQuote(new Quote("Game of Thrones", "Jaime Lannister", "The things I do for love!"));
        dbHandler.addQuote(new Quote("Game of Thrones", "Jaime Lannister", "I think it passing odd that I am loved by one for a kindness I never did, and reviled by so many for my finest act."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Cersei Lannister", "When you play the game of thrones, you win or you die. There is no middle ground."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Cersei Lannister", "A true man does what he will, not what he must."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Cersei Lannister", "The next time you call me sister again, I'll have you strangled in your sleep."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Bran Stark", "Can a man still be brave when he's afraid?"));
        dbHandler.addQuote(new Quote("Game of Thrones", "Eddard Stark", "That's the only time a man can be brave."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Varys", "Power resides only where men believe it resides. [...] A shadow on the  wall, yet shadows can kill. And ofttimes a very small man can cast a  very large shadow."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tyrion Lannister", "I will hurt you for this. A day will  come when you think you’re safe and happy and your joy will turn to  ashes in your mouth. And you will know the debt is paid."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Arya Stark", "Anyone can be killed."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tyrion Lannister", "A mind needs books as a sword needs a whetstone."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Syrio Forel", "There is only one god, and his name is Death. And there is only one thing we say to Death, 'Not today'."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Orell", "People work together when it suits them, they’re loyal when it suits them, they love each other when it suits them, and they kill each other when it suits them."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Ygritte", "You’re mine, and I’m yours. And if we die, we die. But first we’ll live."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Olenna ", "The people are hungry for more than just food. They crave distractions, and if we don't provide them, they'll create their own. And their distractions are likely to end with us being torn to pieces."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Olenna", "So their son will be your nephew, after you are wed to Cersei of course. And you will become the King's stepfather and brother-in-law. When you marry the King, Joffrey's mother, his wife, will also become his sister-in-law. And your son with Joffrey will become Loras's nephew? Grandson? I'm not sure. But your brother will become your father-in-law, that much is beyond dispute."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Varys", "Influence is a matter of patience, Storms come and go, the big fish eat the little fish, and I keep on paddling."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Melisandre", "There’s power in a king’s blood."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Sansa Stark", "I’m not afraid of the pain after what Joffrey’s done to me."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Ramsay", "If you think this has a happy ending, you haven't been paying attention."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Daenerys Targaryen", "I will take what is mine with fire and blood."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Daenerys Targaryen", "Unsullied! Slay the masters, slay the soldiers, slay every man who holds a whip, but harm no child. Strike the chains off every slave you see!"));
        dbHandler.addQuote(new Quote("Game of Thrones", "Jaime Lannister", "So many vows. They make you swear and swear. Defend the King, obey the King, obey your father, protect the innocent, defend the weak. But what if your father despises the King? What if the King massacres the innocent? It's too much. No matter what you do, you're forsaking one vow or another."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Petyr Baelish (Littlefinger)", "Money buys a man's silence for a time. A bolt in the heart buys it forever."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Jojen Reed", "A reader lives a thousand lives before he dies."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Eddard Stark", "He who passes the sentence should swing the sword."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tyrion Lannister", "Let me give you some advice bastard. Never forget what you are. The rest of the world will not. Wear it like armor, and it can never be used to hurt you."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Arya Stark ", "Fear cuts deeper then swords."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Syrio Forel", "Fear cuts deeper then swords."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Eddard Stark", "When the snows fall and the white winds blow, the lone wolf dies but the pack survives."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tyrion Lannister", "The North will never forget."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tyrion Lannister", "It's not easy being drunk all the time. If it were easy, everyone would do it."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tywin Lannister", "The day that you were born. I wanted to carry you into the sea and let the waves wash you away. Instead, I let you live. And I brought you as my son. Because you're a Lannister."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tyrion Lannister", "Every time we deal with an enemy, we create two more."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tyrion Lannister", "Don't fight for a king. Don't fight for his kingdoms. Don't fight for honor, don't fight for glory, don't fight for riches, because you won't get any. This is your city Stannis means to sack. That's your gate he's ramming. If he gets in it will be your house that burns. Your gold he steals, your women he rapes. Those are brave men knocking at our door. Let's go kill them!"));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tyrion Lannister", "Where the castles are made of gingerbread and the moats are filled with blackberry wine. The powerful have always preyed on the powerless, that's how they became powerful in the first place."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Lord Varys", "Perhaps. And perhaps we've grown so used to horror we assume there's no other way."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tyrion Lannister", "Death is so terribly final, while life is full of possibilities."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Ned Stark", "A ruler who hides behind paid executioners soon forgets what death is."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tyrion Lannister", "A mind needs books as a sword needs a whetstone, if it is to keep its edge."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Barristan Selmy", "They say night’s beauties fade at dawn, and the children of wine are oft disowned in the morning light."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Aemon Targaryen", "We are only human, and the gods have fashioned us for love. That is our great glory, and our great tragedy."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Ned Stark", "If you would take a man’s life, you owe it to him to look into his eyes and hear his final words. And if you cannot bear to do that, then perhaps the man does not deserve to die."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tyrion Lannister", "Let them see that their words can cut you, and you’ll never be free of the mockery. If they want to give you a name, take it, make it your own. Then they can’t hurt you with it any more."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Melisandre", "The night is dark and full of terrors."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tyrion Lannister", "A Lannister always pays his debts."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Jaime Lannister", "Give me honorable enemies rather than ambitious ones, and I'll sleep more easily by night."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tyrion Lannister", "Death is so terribly final, while life is full of possibilities."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Robert Baratheon", "I ask you, Ned, what good is it to wear a crown? The gods mock the prayers of kings and cowherds alike."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Catelyn Stark", "He was always clever, even as a boy, but it is one thing to be clever and another to be wise."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Jon Snow", "Jon could not find it in him to pray to any gods, old or new. If they were real, he thought, they were as cruel and implacable as winter."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Robert Baratheon", "I swear to you, I was never so alive as when I was winning this throne, or so dead as now that I've won it."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tyrion Lannister", "My mind is my weapon. My brother has his sword, King Robert has his warhammer, and I have my mind...And a mind needs books as a sword needs a whetstone, if it is to keep its edge."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Desmond", "Wizards die the same as other men, once you cut their heads off."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Petyr Baelish", "You wear your honor like a suit of armor, Stark. You think it keeps you safe, but all it does is weigh you down and make it hard for you to move."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Catelyn Stark", "Laughter is poison to fear."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Lord Varys", "There is no creature on earth half so terrifying as a truly just man."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Sansa Stark", "In life, the monsters win."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Ser Kevan Lannister", "A man who fights for coin is loyal only to his purse."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Ser Brynden Tully", "It is no good hammering your sword into a plowshare if you must forge it again on the morrow."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tyrion Lannister", "Crowns do queer things to the heads beneath them."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Jon Snow", "There's no shame in fear, my father told me, what matters is how we face it."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Salladhor Saan", "What good is this, I ask you? He who hurries through life hurries to his grave."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Theon Greyjoy", "Boys believe nothing can hurt them. Grown men know better."));
                dbHandler.addQuote(new Quote("Game of Thrones", "Sandor Clegane", "Paint stripes on a toad, he does not become a tiger."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Stannis Baratheon", "Kings have no friends, only subjects and enemies."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Brienne", "The gods don’t care about men, no more than kings care about peasants."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Cersei Lannister", "Love is poison. A sweet poison, yes, but it will kill you all the same."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Cersei Lannister", "You should have learned by now, none of us get the things we want."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tywin Lannister", "The greatest fools are ofttimes more clever than the men who laugh at them."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Axell Florent", "Defeat is a disease, and victory is the cure."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Ygritte", "Men can’t own the land no more’n they can own the sea or the sky."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Petyr Baelish", "Always keep your foes confused. If they are never certain who you are or what you want, they cannot know what you are like to do next. Sometimes the best way to baffle them is to make moves that have no purpose, or even seem to work against you."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Petyr Baelish", "A bag of dragons buys a man’s silence for a while, but a well-placed quarrel buys it forever."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Petyr Baelish", "Everyone wants something, Alayne. And when you know what a man wants you know who he is, and how to move him."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Jon Snow", "Sorcery is a sword without a hilt. There is no safe way to grasp it."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Measter Aemon", "Knowledge is a weapon, Jon. Arm yourself well before you ride forth to battle."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Petyr Baelish", "Men of honor will do things for their children that they would never consider doing for themselves."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Lord Rodrik", "History is a wheel, for the nature of man is fundamentally unchanging."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Lord Rodrik", "I prefer my history dead. Dead history is writ in ink, the living sort in blood."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Victarion Greyjoy", "Every man should lose a battle in his youth, so he does not lose a war when he is old."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Septa Roelle", "You’ll find truth in your looking glass, not on the tongues of men."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Petyr Baelish", "In the game of thrones, even the humblest pieces can have wills of their own. Sometimes they refuse to make the moves you've planned for them."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Aeron Damphair", "The waves may break upon the mountain, yet still they come, wave upon wave, and in the end only pebbles remain where once the mountain stood. And soon even the pebbles are swept away, to be ground beneath the sea for all eternity."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Illyrio", "The world is one great web, and a man dare not touch a single strand lest all the others tremble."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tywin Lannister", "No man is free. Only children and fools think elsewise."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Jojen Reed", "A reader lives a thousand lives before he dies. The man who never reads lives only one."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Lord Brynden", "A man must know how to look before he can hope to see."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Lord Brynden", "The past remains the past. We can learn from it, but we cannot change it."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Lord Brynden", "Men live their lives trapped in an eternal present, between the mists of memory and the sea of shadow that is all we know of the days to come."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","Some old wounds never truly heal, and bleed again at the slightest word."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","Winter is coming."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","Bran thought about it. 'Can a man still be brave if he's afraid?', 'That is the only time a man can be brave,' his father told him."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","People often claim to hunger for truth, but seldom like the taste when it's served up."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","Why is it that when one man builds a wall, the next man immediately needs to know what's on the other side?"));
        dbHandler.addQuote(new Quote("Game of Thrones", "","The brightest flame casts the darkest shadow."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Daenerys Targaryen", "A dragon is not a slave."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Catelyn Stark", "Wise men do not make demands of kings."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Syrio ", "The heart lies and the head plays tricks with us, but the eyes see true. Look with your eyes. Hear with your ears. Taste with your mouth. Smell with your nose. Feel with your skin. Then comes the thinking, afterwards, in that way knowing the truth."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","Old stories are like old friends. You have to visit them from time to time."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","One voice may speak you false, but in many there is always truth to be found."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","Wind and words. We are only human, and the gods have fashioned us for love. That is our great glory, and our great tragedy."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","A bruise is a lesson... and each lesson makes us better."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","I swear to you, sitting a throne is a thousand times harder than winning one."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","The man who fears losing has already lost."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","A lord must learn that sometimes words can accomplish what swords cannot."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","If a man paints a target on his chest, he should expect that sooner or later someone will loose an arrow on him."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","You can't hammer tin into iron, no matter how hard you beat it, but that doesn't mean it's useless."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Syrio ", "Swift as a deer. Quiet as a shadow. Fear cuts deeper than swords. Quick as a snake. Calm as still water."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","A ruler who hides behind paid executioners soon forgets what death is."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","Minds are like swords, I do fear. The old ones go to rust."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","Some truths did not bear saying, and some lies were necessary."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","A man who won't listen can't hear."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","As we sin, so do we suffer"));
        dbHandler.addQuote(new Quote("Game of Thrones", "","...grief can derange even the strongest and most disciplined of minds."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","A long summer always meant a long winter to come."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","Wisdom oft comes from the mouth of babes."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","A man could not always be where he belonged, though."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","They hate you because you act like you're better than they are"));
        dbHandler.addQuote(new Quote("Game of Thrones", "","We only make peace with our enemies. That's why it's called making peace."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Cersei Lannister", "Everyone who isn't us is an enemy."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","You win or you die."));
        dbHandler.addQuote(new Quote("Game of Thrones", "","A mad man sees what he sees."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tywin Lannister", "Some battles are won with swords and spears, others with quills and ravens."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tywin Lannister", "There is a tool for every task, and a task for every tool."));
        dbHandler.addQuote(new Quote("Game of Thrones", "Tyrion Lannister", "Most men would rather deny a hard truth than face it."));

        dbHandler.addCharacterImage(new CharacterImage("Arya Stark","arya_stark_1right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Arya Stark","arya_stark_2right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Arya Stark","arya_stark_2right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Arya Stark","arya_stark_3right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Arya Stark","arya_stark_3right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("background.jpg","background.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Brienne","brienne_1left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Brienne","brienne_1left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Brienne","brienne_1right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Brienne","brienne_1right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Catelyn Stark","catelyn_stark_1left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Catelyn Stark","catelyn_stark_1left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Catelyn Stark","catelyn_stark_1right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Catelyn Stark","catelyn_stark_1right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Catelyn Stark","catelyn_stark_2right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Catelyn Stark","catelyn_stark_2right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Cersei Lannister","cersei_lannister_1left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Cersei Lannister","cersei_lannister_1right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Cersei Lannister","cersei_lannister_2left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Cersei Lannister.jpg","cersei_lannister_2right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Daenerys Targaryen","daenerys_targaryen_1left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Daenerys Targaryen","daenerys_targaryen_1right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Daenerys Targaryen","daenerys_targaryen_2left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("general.jpg","general.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("general.jpg","general.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("general_2.jpg","general_2.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("general_2.jpg","general_2.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Jon Snow","jon_snow_1left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Jon Snow","jon_snow_1right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Jon Snow","jon_snow_2right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Petyr Baelish","petyr_baelish_1left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Petyr Baelish","petyr_baelish_1right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Petyr Baelish","petyr_baelish_2left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Petyr Baelish","petyr_baelish_2right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Petyr Baelish","petyr_baelish_3left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Sansa Stark","sansa_stark_1left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Sansa Stark","sansa_stark_1right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Sansa Stark","sansa_stark_2left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Sansa Stark","sansa_stark_3left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Stannis Baratheon","stannis_baratheon_1left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Stannis Baratheon","stannis_baratheon_2left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Theon Greyjoy","theon_greyjoy_1left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Theon Greyjoy","theon_greyjoy_1right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Tyrion Lannister","tyrion_lannister_1left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Tyrion Lannister","tyrion_lannister_1right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Tyrion Lannister.jpg","tyrion_lannister_2left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Tyrion Lannister","tyrion_lannister_3left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Tyrion Lannister","tyrion_lannister_4left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Tyrion Lannister","tyrion_lannister_5left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Tywin Lannister","tywin_lannister_1left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Tywin Lannister","tywin_lannister_1right.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Tywin Lannister","tywin_lannister_2left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Tywin Lannister","tywin_lannister_3left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Tywin Lannister","tywin_lannister_4left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Ygritte","ygritte_1left.jpg"));
        dbHandler.addCharacterImage(new CharacterImage("Ygritte","ygritte_2left.jpg"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
