public interface PokemonInterface {
    public Pokemon createPokemon(String name, int health, String type){
        this.name = name;
        this.health = health;
        this.type = type;
        return Pokemon;
    }
    String pokemonInfo(Pokemon pokemon){

        return "Name: " + name + " Health: " + health + " Type: " + type; 
    }

    void listPokemon(){
        System.out.println(Pokemon + "to have in pokedex");
    }
}
