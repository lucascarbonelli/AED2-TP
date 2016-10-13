//conj(jugadores) => vector(tupla<id, tupla<estaConect, sanciones, posicion, conjuntoLineal(tupla<tipoPokemon, cantidad>), it(a id en heap)>>)
_______________________________________________								//con it							//este it lleva al heap
																												//del poke cercano

Op1: (queda la op3)
jugadores => vector(it(infoJug))
//si está expulsado, o no está agregado, apunta a NULL
infoJug:
estaConect bool
sanciones nat
posicion coord
it pokemons
it(colaPrioridad)

//estas dos son para saber posiciones y adyacencias
matrizJugadores => it matrizJ(nat)
//donde los nat son la cant de jug que hay ahi

Op2: (queda la op3)
jugAccRapido => vector(it(coord))
//coord de la matrizJ
//si está expulsado, o no está agregado, apunta a NULL
infoJug:
estaConect bool
sanciones nat
posicion coord
it pokemons
it(colaPrioridad)

//estas dos son para saber posiciones y adyacencias. Las como el mapa
matrizJugadores => it matrizJ(it(infoJug))
_______________________________________________

Op3:
jugadores (el obs) it vector(infoJug) 
jugadores ES vector(infoJug)
//coord de la matrizJ
//si está expulsado, o no está agregado, apunta a NULL
infoJug:
estaConect bool
sanciones nat
posMatriz it conj(id) //relacionar estaConect con esto
coordenada c
it pokemons
it(colaPrioridad)

//estas dos son para saber posiciones y adyacencias. Las como el mapa
matrizJugadores => it matriz(conj(id))
//true si está, false si no
(queda la op3)
__________

matrizPokemons => matriz(<bool, itDicc(posPokemons)>)
//donde true si hay un poke, false sino

pokemons => it conjuntoLineal(tupla<tipoPokemon, cant>)
//de un jugador

expulsados => conjuntoLineal(id)

posPokemons => diccLineal(coord, infoCoord)
//si agregamos un poke, es agregar coord a este dicc, que es O(1)

pokemonsTotales => diccTrie(tipo, infoPoke)
pokemonsTotales.claves => conjuntoLineal
//acá están los PS y PC
infoPoke:
cant
pokesSalvajes conjuntoLineal(itDicc(posPokemons)) //
//si hay algun tipo que no este en el mapa, o el conj es vacio o el it va a NULL (decidir)
infoCoord:
tipo
cantMovCapt
colaPrioridad

cantidadPokeTot => nat

__________

mapa => matriz(<bool, conjuntoLineal>)
_______________________________________________




vector está, conjuntoLineal está, it de conjuntoLineal está
HACER y divisiones:
·matriz, it(matriz) -> P
·diccTrie, it(diccTrie) -> I
·colaPrioridad, it(colaPrioridad) -> L


·mapa -> J
·juego -> P/J (y los que terminen)

__________

infoJug, infoPoke, infoCoord, cantidadPokeTot, matrizes(todas con el modulo hecho)
