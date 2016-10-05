conj(jugadores) => vector(tupla<id, tupla<estaConect, sanciones, posicion, vector(tupla<tipoPokemon, cantidad>)>>)

conj(expulsados) => vector(id)
								//este cant es de poke de ese tipo
conj(Pokemons) => trie(tipo, tupla<cant, vector(tupla<coord, cantMovCapt, heap(id)>)>)) 
						//representa todos los pokes: 			//el heap debe estar
						//si no hay salvajes, su vector			//ordenado por la
						//de coord está vacío					//cant de pokes de las id