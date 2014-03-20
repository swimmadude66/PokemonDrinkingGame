package Backend;

import java.util.ArrayList;
import java.util.List;

public class Control {
	List<Tile> tiles;
	List<Player> players;
	Die die;
	
	Player active;
	int playerIndex;
	
	public Control(){
		tiles = new ArrayList<Tile>();
		setUpTiles();
		players = new ArrayList<Player>();
		die = new Die();
		}
	
	private void setUpTiles(){
		for(int i=0; i<160; i++){
			Tile newGuy = new Tile();
			newGuy.id = i;
			switch(i){
			case 0:
				newGuy.text="Pick your pokemon!";
				break;
			case 1:
				newGuy.text="Ratatta used tackle! Roll again; if 1, finish your drink in shame.";
				break;
			case 2:
				newGuy.text="Caterpie used String Shot! Take a drink and miss a turn.";
				newGuy.skipTurn=1;
				break;
			case 3:
				newGuy.text="Pidgey used Quick Attack! Take a drink and roll again.";
				break;
			case 4:
				newGuy.text="Weedle used Poison Sting! Take a drink and miss a turn.";
				newGuy.skipTurn=1;
				break;
			case 5:
				newGuy.text="Metapod/Kakuna used Harden! Miss one turn.";
				newGuy.skipTurn=1;
				break;
			case 6:
				newGuy.text="If you're a guy, guys drink. If you're a girl, girls drink.";
				break;
			case 7:
				newGuy.text="Beedrill used Twineedle! Pick two people to drink.";
				break;
			case 8:
				newGuy.text="Butterfree used Sleep Powder! Everyone else falls asleep and you roll again.";
				break;
			case 9:
				newGuy.text="Spearow used Leer! Challenge the person to your left to a staring match. Loser drinks.";
				break;
			case 10:
				newGuy.text="Pewter Gym: Roll die. Even: give a drink. Odd: Take a drink.";
				break;
			case 11:
				newGuy.text="Jigglypuff used Sing! First person here is responsible for drawing on all sleeping members of the party.";
				break;
			case 12:
				newGuy.text="Zubats... They're... They're everywhere! Take a drink. Next turn, if you roll a 1 or 2, take a drink and stay here.";
				break;
			case 13:
				newGuy.text="Clefairy used Metronome! Play 'A & B' from Sociables.";
				break;
			case 14:
				newGuy.text="Zubats... They're... They're everywhere! Take a drink. Next turn, if you roll a 1 or 2, take a drink and stay here.";
				break;
			case 15:
				newGuy.text="Paras used Leech Life. Take the next player's drink for them. If they don't have to drink, give one.";
				break;
			case 16:
				newGuy.text="Moon Stone. Go outside. If you can see the moon, drink 2. Otherwise, drink 1.";
				break;
			case 17:
				newGuy.text="Sandshrew used Sand Attack! You must drink with your non-dominant hand until Vermillion Gym.";
				break;
			case 18:
				newGuy.text="Ekans used Wrap! Take one drink now and one at the end of your next turn.";
				break;
			case 19:
				newGuy.text="Jynx used Lovely Kiss! Kiss someone next to you and you both drink.";
				break;
			case 20:
				newGuy.text="Cerulean Gym: Give 2 drinks and take 1.";
				break;
			case 21:
				newGuy.text="Bellsprout used Growth! You cannot be given drinks until your next turn. Skip next turn";
				newGuy.skipTurn=1;
				break;
			case 22:
				newGuy.text="Abra used Teleport. Roll a die. Even: move forward 2. Odd: Move back 2.";
				break;
			case 23:
				newGuy.text="Oddish used Sweet Scent! All players within 2 tiles are drawn to your space and take 2 drinks.";
				break;
			case 24:
				newGuy.text="Venonat used Disable! First person here disables one word. Any player using that word drinks.";
				break;
			case 25:
				newGuy.text="Rival: Give 2 and take 2.";
				break;
			case 26:
				newGuy.text="Meowth used Pay Day. Everyone but you drinks.";
				break;
			case 27:
				newGuy.text="Day Care Center: Don't drink on the next non-mandatory space you land on.";
				break;
			case 28:
				newGuy.text="Mankey used Focus Energy! Give one drink this turn and give 2 next turn. Skip next turn.";
				newGuy.skipTurn=1;
				break;
			case 29:
				newGuy.text="Farfetch'd used Fury Attack! Roll a die. Give 1 for every even and take 1 for every odd. (Ex. 6 is take 3, give 3.)";
				break;
			case 30:
				newGuy.text="Vermillion Gym: Roll a die. Even: you're paralyzed, take 2 drinks, and miss a turn. Odd: take a drink.";
				break;
			case 31:
				newGuy.text="Magikarp used Splash! But nothing happened...";
				break;
			case 32:
				newGuy.text="SS Anne: Either drink 2 and miss 1 turn or drink 1 and miss 2 turns.";
				break;
			case 33:
				newGuy.text="Drowzee used Disable! First player here disables a word. Everyone using it drinks.";
				break;
			case 34:
				newGuy.text="If you're a guy, guys take 2 drinks. If you're a girl, girls take 2.";
				break;
			case 35:
				newGuy.text="Diglett used Dig! Miss next turn, give 2 next turn.";
				newGuy.skipTurn=1;
				break;
			case 36:
				newGuy.text="Machop used Submission! Challenge the person to your right to arm wrestle. Loser drinks 2.";
				break;
			case 37:
				newGuy.text="Magnemite used Supersonic! Roll a die and move back that many spaces.";
				break;
			case 38:
				newGuy.text="Vulpix used Imprison. Give a drink, take a drink, and stand in the corner until your next turn.";
				break;
			case 39:
				newGuy.text="Eevee used Focus Energy. First person here makes a rule.";
				break;
			case 40:
				newGuy.text="Celadon Department Store: Spend next 2 turns shopping for TMs and iPhones.";
				newGuy.skipTurn=2;
				break;
			case 41:
				newGuy.text="Dratini used Dragon Rage! Take 2 drinks.";
				break;
			case 42:
				newGuy.text="Game Corner: You're playing against the odds. Roll a die. If you get a 3 or 5, give 2 drinks. Otherwise, miss 2 turns.";
				break;
			case 43:
				newGuy.text="Porygon used Tri-Attack. If anyone gives you a drink while here, they take 3 themselves.";
				break;
			case 44:
				newGuy.text="Celadon Gym: Roll a die. Even: PoisonPowder. Take 2 drinks. Odd: StunSpore. Miss 2 turns.";
				break;
			case 45:
				newGuy.text="Rocket Hideout: Roll a die. If 1, your phone went off; way to go retard, now everyone knows you're here. Miss 3 turns.";
				break;
			case 46:
				newGuy.text="You found a Rare Candy! Take an extra turn.";
				break;
			case 47:
				newGuy.text="It's Jessie and James! Everyone drinks 2 while they blast off.";
				break;
			case 48:
				newGuy.text="Rocket Boss is kind of intimidating. Drink 3 and everyone else drinks 1.";
				break;
			case 49:
				newGuy.text="Pokemon Tower: You can't speak until you pass PokeFlute. Each word is 1 drink.";
				break;
			case 50:
				newGuy.text="Gastly used Confuse Ray! Roll a die and move back that many spaces.";
				break;
			case 51:
				newGuy.text="Cubone used Bone Club! It hurts, that's all. Take 2 drinks.";
				break;
			case 52:
				newGuy.text="Haunter used Night Shade! If it's night, take 3 drinks.";
				break;
			case 53:
				newGuy.text="Everyone that believes in ghosts gives a drink.";
				break;
			case 54:
				newGuy.text="Marowak used Bonemerang! If you landed on Cubone, give 3 drinks. Otherwise, take 3.";
				break;
			case 55:
				newGuy.text="Jessie and James are still incompetent. Drink twice (again) while they blast off (again).";
				break;
			case 56:
				newGuy.text="PokeFlute: If someone is asleep, wake them up.";
				break;
			case 57:
				newGuy.text="Fighting Dojo: If you've taken martial arts, give 2 and take 2.";
				break;
			case 58:
				newGuy.text="Primeape used Fury Swipes! If someone is wearing a hat, steal if from them before the end of the game.";
				break;
			case 59:
				newGuy.text="Hitmonlee used Double Kick! Split 4 drinks between 2 people.";
				break;
			case 60:
				newGuy.text="Hitmonchan used Counter! Any drinks given to you while on this space are doubled and given to the sender.";
				break;
			case 61:
				newGuy.text="Rocket Grunt is an asshole. I can't think of anything clever. Drink 3.";
				break;
			case 62:
				newGuy.text="Rival: What's this guy's deal anyways? Give 3 and take 3.";
				break;
			case 63:
				newGuy.text="Lapras used Surf! Give the person on your left a piggyback ride. If you can't, you both take 2.";
				break;
			case 64:
				newGuy.text="Jessie and James are still... You get the point. You and the two people next to you drink 3.";
				break;
			case 65:
				newGuy.text="Giovanni's gotten stronger since last time. Drink 3 and everyone else drinks 2.";
				break;
			case 66:
				newGuy.text="Master Ball: You found a Master Ball! You may now skip any non-mandatory space.";
				break;
			case 67:
				newGuy.text="Saffron Gym: Think of a number and roll a die. If you were right, give 4. Otherwise, take 3.";
				break;
			case 68:
				newGuy.text="Doduo used Agility! Roll again.";
				break;
			case 69:
				newGuy.text="Snorlax used Rest! Miss 3 turns unless you landed on PokeFlute.";
				break;
			case 70:
				newGuy.text="The bike was totally used the 1000000. Next turn, double your roll.";
				break;
			case 71:
				newGuy.text="Fearow used Mirror Move! Do whatever the last person did.";
				break;
			case 72:
				newGuy.text="Parasect used Leech Life! Take the next person's drink for them. If no drinks are taken, give 2.";
				break;
			case 73:
				newGuy.text="Dodrio used Tri Attack! Give 2 drinks to 3 people.";
				break;
			case 74:
				newGuy.text="Weepinbell used Growth! Miss 2 turns, but you can't be given drinks over that time.";
				newGuy.skipTurn=2;
				break;
			case 75:
				newGuy.text="Magikarp used Splash! But nothing happened...";
				break;
			case 76:
				newGuy.text="Goldeen used Peck! Take 2 drinks. What did you expect? Goldeen is pathetic.";
				break;
			case 77:
				newGuy.text="Gloom used Petal Dance! Give 2 drinks the next 3 turns.";
				break;
			case 78:
				newGuy.text="Krabby used Bubble! Take 2 drinks and give 3.";
				break;
			case 79:
				newGuy.text="Ditto used Transform! Do whatever the next person does.";
				break;
			case 80:
				newGuy.text="Poliwag used DoubleSlap! Give 2 drinks to two people.";
				break;
			case 81:
				newGuy.text="Shellder used Clamp! If another player is past Slowbro, advance to Slowbro.";
				break;
			case 82:
				newGuy.text="Eeveelution time! First person here makes a rule.";
				break;
			case 83:
				newGuy.text="Pidgeotto used Quick Attack! Take 3 drinks and roll again.";
				break;
			case 84:
				newGuy.text="Slowpoke used Amnesia! First person here makes a gesture, last person to copy it drinks.";
				break;
			case 85:
				newGuy.text="Fuschia Gym: Give 3, take 3. If you're wearing purple, this becomes 4.";
				break;
			case 86:
				newGuy.text="Safari Zone: Nothing says child friendly like hunting down animals, throwing rocks at them, and taking them captive. Take away someone's next turn.";
				break;
			case 87:
				newGuy.text="Scyther used Leer! Anyone wearing red, take it off. Undergarments optional.";
				break;
			case 88:
				newGuy.text="Psyduck used Confusion! First person here makes a gesture, last person to copy it drinks.";
				break;
			case 89:
				newGuy.text="Exeggcute used Barrage! Everyone gives one drink.";
				break;
			case 90:
				newGuy.text="Chansey used Sing! Pick someone to miss 2 turns.";
				break;
			case 91:
				newGuy.text="Pinsir used Vicegrip! Challenge the person to your right to a grip contest. First person to cry mercy takes 3 drinks.";
				break;
			case 92:
				newGuy.text="Tauros used Take Down! Give 3 drinks and take 2.";
				break;
			case 93:
				newGuy.text="Gold Teeth: How the hell did the old man lose these? Return them to give 3 drinks and 1 missed turn.";
				break;
			case 94:
				newGuy.text="Kangaskhan used Dizzy Punch! Give someone 2 drinks and make them move back a die roll.";
				break;
			case 95:
				newGuy.text="Dragonair used Dragon Rage! Take 4 drinks.";
				break;
			case 96:
				newGuy.text="Take 2 drinks.  Next turn, if you roll a 1 or 6 take a drink and try again the turn after.";
				break;
			case 97:
				newGuy.text="Raticate used Quick Attack! Drink 3 and roll again.";
				break;
			case 98:
				newGuy.text="Horsea used Hydro Pump! Drink 3.";
				break;
			case 99:
				newGuy.text="Take 2 drinks.  Next turn, if you roll a 1 or 6 take a drink and try again the turn after.";
				break;
			case 100:
				newGuy.text="Tentacruel used Constrict! The next player's roll is halved.";
				break;
			case 101:
				newGuy.text="Grimer used Poison Gas! All players drink 1 this turn and next.";
				break;
			case 102:
				newGuy.text="Magmar used Fire Punch! Any player on a space weak to fire drink 4.";
				break;
			case 103:
				newGuy.text="You're about to resurrect a fossil! Anyone older than you drinks 2.";
				break;
			case 104:
				newGuy.text="Kabuto used Leer! Engage in back to back staring contests with the people beside you. Losers drink 2.";
				break;
			case 105:
				newGuy.text="Omanyte used Withdraw! For two turn you cannot be given drinks.";
				break;
			case 106:
				newGuy.text="Aerodactly used Bite! Name how it's resurrected and give 4 instead of drinking 4.";
				break;
			case 107:
				newGuy.text="Omastar used Spike Cannon! Roll die. Give 2 drinks to that many people.";
				break;
			case 108:
				newGuy.text="Kabutops used Slash! Drink 4.";
				break;
			case 109:
				newGuy.text="Roll die. Even roll again. Odd, drink twice as many evens rolled.";
				break;
			case 110:
				newGuy.text="Electrode used Explosion! Everyone takes 3 drinks.";
				break;
			case 111:
				newGuy.text="Electrobuzz used Thunder Punch! Any player on a space weak to electricity drinks 4.";
				break;
			case 112:
				newGuy.text="Magneton used Supersonic! Roll die and travel back double that many spaces.";
				break;
			case 113:
				newGuy.text="Zapdos used Thunder! Drink 5.";
				break;
			case 114:
				newGuy.text="Take 2 drinks.  Next turn, if you roll a 1 or 6 take a drink and try again the turn after.";
				break;
			case 115:
				newGuy.text="Golbat used Leech Life! Give X number drinks, roll die. If X> die, drink double X.";
				break;
			case 116:
				newGuy.text="Seel used Aurora Beam! If you've never seen the Northern lights, everyone drinks 2.";
				break;
			case 117:
				newGuy.text="Seadra used Hydro Pump! Drink 4.";
				break;
			case 118:
				newGuy.text="Golduck used Disable! First here picks 1 word to disable, everyone who says it takes a drink.";
				break;
			case 119:
				newGuy.text="Slowbro used Amnesia! First one here makes a gesture, last to copy said gesture takes a drink.";
				break;
			case 120:
				newGuy.text="Dewgong used Ice Beam! Hit someone with a piece of ice or drink 4.";
				break;
			case 121:
				newGuy.text="Kingler used Crabhammer! Bring down the Crabhammer on someone; give 4 drinks.";
				break;
			case 122:
				newGuy.text="Articuno used Blizzard! Give 5 drinks.";
				break;
			case 123:
				newGuy.text="First drink 1, then your gender drinks 3.";
				break;
			case 124:
				newGuy.text="Arbok used Wrap! Take 2 drinks now and 2 drinks next turn.";
				break;
			case 125:
				newGuy.text="Seaking used Supersonic! Roll die and travel back double that many spaces.";
				break;
			case 126:
				newGuy.text="Sandslash used Sand Attack! You must drink with your non-dominant hand until the end of the game.";
				break;
			case 127:
				newGuy.text="Poliwhirl used Double Slap! Give 3 drinks to different people.";
				break;
			case 128:
				newGuy.text="The last challenge before the Indigo Plateau and the Pokemon League. Take 4 drinks to steady your nerves.";
				break;
			case 129:
				newGuy.text="Zubats... They're... They're everywhere! Take 2 drinks. Next turn if you roll a 1 or 2 stay here and take 2 drinks.";
				break;
			case 130:
				newGuy.text="Machoke used Submission! Challenge the person to your right to an arm wrestle, but they get to use both hands. Loser drinks 4.";
				break;
			case 131:
				newGuy.text="Zubats... They're... They're everywhere! Take 2 drinks. Next turn if you roll a 1 or 2 stay here and take 2 drinks.";
				break;
			case 132:
				newGuy.text="Graveler used Earthquake! Roll die. Give that many drinks to the person to your left, 1 less to their left, etc... X=0.";
				break;
			case 133:
				newGuy.text="Moltres used Fire Blast! Drink 5, give 5.";
				break;
			case 134:
				newGuy.text="Heal up and get ready for the Elite Four.";
				break;
			case 135:
				newGuy.text="Name Lorelei's Pokemon in red, blue, or yellow, if you cannot drink 4.";
				break;
			case 136:
				newGuy.text="Name Bruno's Pokemon in red, blue, or yellow, if you cannot drink 4.";
				break;
			case 137:
				newGuy.text="Name Agatha's Pokemon in red, blue, or yellow, if you cannot drink 4.";
				break;
			case 138:
				newGuy.text="Name Lance's Pokemon in red, blue, or yellow, if you cannot drink 4.";
				break;
			case 139:
				newGuy.text="Name Rival's Pokemon (according to your starter) in red, blue, or yellow, if you cannot drink 5.";
				break;
			case 140:
				newGuy.text="Professor Oak just came...";
				break;
			case 141:
				newGuy.text="What now? You just defeated your Rival, Oak came, and you're the champion of the Pokemon League. Well there is the rumour of an experimental Pokemon on route #4... Drink 4.";
				break;
			case 142:
				newGuy.text="The last unexplored place in all of Kanto. It's like Victory Road all over again. Drink 5 to steady your nerves.";
				break;
			case 143:
				newGuy.text="Hypno used Hypnosis! Roll die; even make a player miss 3 turns, odd, miss 3 turns.";
				break;
			case 144:
				newGuy.text="Lickitung used Slam! Drink 4, then lick someone next to you.";
				break;
			case 145:
				newGuy.text="You found a Rare Candy! Level up and take an extra turn.";
				break;
			case 146:
				newGuy.text="Mewtwo used Psychic! Drink 7, if you're a test tube baby give 14.";
				break;
			case 147:
				newGuy.text="So me and Oak just had a talk... You need to finish your Pokedex... Sorry 'bout that. First here \"remakes\" this square to any xie has landed on =excluding mandatories).";
				break;
			case 148:
				newGuy.text="Exeggutor used Hypnosis! Pick 3 numbers and roll die, if your number shows up, make a player miss 3 turns. If it doesn't, miss 3 turns.";
				break;
			case 149:
				newGuy.text="Cloyster used Clamp! Take 3 drinks and grab someone beside you. You cannot let go until your next turn.";
				break;
			case 150:
				newGuy.text="Ninetales used Roar! Move another player back 2 dice rolls.";
				break;
			case 151:
				newGuy.text="Golem used Explosion! Everyone take 4 drinks.";
				break;
			case 152:
				newGuy.text="Poliwrath used Double Slap! Give 4 drinks to 2 different people.";
				break;
			case 153:
				newGuy.text="Gengar used Dream Eater! Anyone who is missing their next turn drinks 5.";
				break;
			case 154:
				newGuy.text="Machamp used Submission! You pick 2 people from the group.  Clear some space because you're going to arm wrestle both of them with 1 hand, while they both use 2.  Loser=s) drinks 5.  Good luck.";
				break;
			case 155:
				newGuy.text="Just kidding, this isn't a full restore.  A better title for this space would be \"The Space that tricks you then fucks you over\". Roll die: even move 1 ahead, odd, move 2 ahead.";
				break;
			case 156:
				newGuy.text="Gyrados used Dragon Rage! Drink 6, unless you landed on Magikarp in which case give 6, and if you landed on both Magikarp give 9.";
				break;
			case 157:
				newGuy.text="Dragonite used Hyper Beam! Take 6 drinks and miss a turn to recharge.";
				break;
			case 158:
				newGuy.text="Mew used Psychic! Give 7, if you have an older twin give 14.";
				break;
			case 159:
				newGuy.text="It's done. You caught all 151 Pokemon and even got a useless Diploma.  Not much else to do besides clim a mountain and wait for whoever comes after you. Finish your drink. You are a Pokemon Master!";
				break;
			default:
				break;
			}
			tiles.add(newGuy);
		}
	}
	
}
