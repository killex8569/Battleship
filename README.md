# Battleship
Battleship made with Java. Solo mode, PVP mode and custom mode

- victoire
- règles

### Board

- grille[]()
- placements
- tirs reçus

### Ship

- positions
- touché / coulé

### Player

- socket
- board
- pseudo
- prêt / pas prêt

## Coté client (Classes POO)
Client
CLI
ProtocolHandler


## Protocol réseau

Client --> Serveur
```
{
  "type": "fire",
  "x": 4,
  "y": 7
}
```

Serveur --> Client
```
{
  "type": "result",
  "hit": true,
  "sunk": false
}
```


## Gestion des erreurs

- client qui crash
- socket fermé
- timeout
- packet incomplet


## En plus (Pas obligatoire mais utile pour se distinguer)

- Reconnexion d’un ou de plusieurs joueurs
- Spectateurs
- Plusieurs parties simultanées --> Multi threading
- IA
- Dockerisation
- Tests unitaires
