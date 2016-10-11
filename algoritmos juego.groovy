LUCAS

agPoke:
	matrPokes->true
	posPoke->ag coord
		infoCoord
			tipo
			cantMovCapt
			colaPrio
	pokeTot->ag tipo(si no esta)
		infoPoke
			cant++
			ag al conj puntero a la infoCoord
	cantidadPokeTot

_____

PATO

agJug:
	=>viene desconectado
	jugadores
		infoJug

conectarse:
	jugadores
		infoJug
	pokeTot-> si hay un poke en rango, se modifica su heap respectivo (atraves matrizPoke)
	matrizJug->se agrega en conj(id)
		infoCoord

desconectarse:
	jugadores
		infoJug
	pokeTot-> si hay un poke en rango, se modifica su heap respectivo (atraves matrizPoke)
	matrizJug->se agrega en conj(id)
		infoCoord

_____

IVAN

moverse:
	jugadores
		infoJug
	matrizJug->coord o sancion
	matrizPoke->capt(muchos)
	expulsados->sancion
	pokemons->capt(muchos)
	posPokemon->capt(muchos)
		infoCoord->capt(muchos)
	pokeTot->capt(muchos)
		infoPoke->capt(muchos)
	cantidadPokeTot->sancion

	jugadores[id]->infoJug:
		//coordenadas
		eliminarSiguiente(posMatriz)
		posMatriz = matrizJug[coord]
			if(el conj esta vacio, lo agrego, y me devuelve it)
			else(el conj no esta vacio, lo agrego, y me devulve it)
		//heaps
		if(esta en rango poke)
			if(se mueve adentro)
				no pasa nada en su rango
				otros rangos: captPoke(mov)
			else(se mueve afuera)
				if(se mueve a un rango)
					lo rompe
					otros rangos: captPoke(mov)
				else(se mueve a ningun rango)
					otros rangos: captPoke(mov)
		else(esta fuera de rango)
			if (se mueve a un rango)
				lo rompe
				otros rangos: captPoke(mov)
			else(se mueve a ningun rango)
				otros rangos: captPoke(mov)
			//y en todos, cambian los pokes por capturar, etc



itConj it = CreaIt(dicctrie.claves)
while(haySigueinte(it))
 	itConj itc = CreatIt(siguiente(it).pokesSalvajes)
 	while(haySigueinte(itc))
 		(if no interrumpio rango)
 		modificas infoCoord (itc)
 		siguiente(itc)
 	siguiente(it)


if(si se elimino)
	cantidadPokeTot--

		//sanciones
		if(debeSancionarse?(mov)
			sanciones++

_____

JUAB

creajuego: TRIVIAL
indiceRareza: TRIVIAL
cantidadPokeTot: TRIVIAL
cantMismaEspecie: TRIVIAL


posPokeCercano y hayPokeCercano: con matrizes
puedoAgregarPokemon: con matriz poke
entrenadoresPosibles: matriz jug
