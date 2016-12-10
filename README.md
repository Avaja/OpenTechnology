# OpenTechnology
Custom blocks for OpenComputers and Minecraft.

Аддон добавляет разные по смыслу и применению блоки и предметы.
(Содержит 3 блоков и 2 предмета.)


## Креативный чатбокс
Креативный чатбокс генерирует 2 события.
#### `chat_message`
Аргументы: `id` измерения, `playerPosX`, `playerPosY`, `playerPosZ`, дистанция до игрока, имя игрока, сообщение.
#### `chat_command`
Возращает данные те же что `chat_message`.
Однако вызывается только в том случае, если первый символ в сообщении был `#`.
Кроме того, такие сообщения не видны в чате (только в чатбоксах).

### Методы
#### `say(message: string)`
Отправляет всем игрокам сообщение `message`.

#### `sayColored(message: string)`
Форматирующая функция, заменяет символ параграфа на `@`, работает как `say`.

#### `tell(name: string, message: string)`
Отправляет сообщение `message` игроку с ником `name`.


## Чатбокс
Обычный чатбокс имеет ограниченный радиус работы.
Чатбокс генерирует 2 события.
#### `chat_message`
Аргументы - имя игрока, сообщение.

#### `chat_command`
Возращает данные те же что `chat_message`.
Однако вызывается только в том случае, если первый символ в сообщении был `#`.
Кроме того, такие сообщения не видны в чате (только в чатбоксах).

### Методы
#### `say(message: string)`
Отправляет всем игрокам сообщение `message`.

#### `sayColored(message: string)`
Форматирующая функция, заменяет символ параграфа на `@`, работает как `say`.

## Антенна Дальнего действия (LDA)
Антенна - состоит из контроллера 14 частей антенны поставленных на сверху и ячейки антенны, образует мультиблочную структуру.
Особенностями антенны является - зависимость расстояние передачи от высоты антенны, после передачи антенна некоторое время стоит в режим передачи.
Она является одноканальной.

Генерирует 1 событие.
#### `ld_message`
Агрументы - адрес отправителя, дистанция, сообщение.

### Методы

#### `getMaxDistance()`.
Возвращает максимально возможное расстояние отправки сообщения.

#### `getDistance()`.
Возвращает установленное расстояние отправки сообщения.

#### `getRealDistance()`.
Возвращает реальное расстояние отправки сообщения. Оно рассчитывается так: Установленное Расстояние * (LDAControllerY + 16) / 256.
Чем выше антенна - тем больше приближение к установленному расстоянию передачи.

#### `getChannel()`.
Возвращает текущий канал передачи.

#### `isTransmit()`.
Возращает текущий статус передачи.

#### `open(channel:int)`.
Открывает канал. Довольно долгий процесс.

#### `setDistance(distance:int)`.
Устанавливает максимальное расстояние для передачи.

#### `maxPacketSize()`.
Возвращает максимальный размер пакета.

#### `broadcast(data:string)`.
Рассылает сообщение по каналу.

#### 'send(address:string, data:string)'.
Отправляет сообщение конкретному адресату. Обое должны работать на одном канале.

*Описание дополняется...*
