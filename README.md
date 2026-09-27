# 📦 Bigger Ender Chest

[![Modrinth](https://img.shields.io/badge/Modrinth-Bigger%20Ender%20Chest-00AF5C?style=for-the-badge&logo=modrinth&logoColor=white)](https://modrinth.com/mod/bigger-ender-chest)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)
[![Loader](https://img.shields.io/badge/Loader-Fabric-lightgrey?style=for-the-badge&logo=fabric)](https://fabricmc.net/)

**Bigger Ender Chest** is a lightweight, clean, and vanilla-friendly Fabric mod for Minecraft that expands standard Ender Chest storage from **27 slots (3 rows)** to **54 slots (6 rows)** — doubling your interdimensional storage capacity!

---

## ✨ Features

- **Double Capacity**: Expands the vanilla Ender Chest to a full 54-slot (6 rows) double-chest capacity.
- **Safe & Vanilla-Friendly**: 
  - Preserves all existing items stored in the original 27 slots.
  - Retains per-player private Ender Chest data.
  - Uses the vanilla 9x6 container GUI without adding custom blocks, bloated entities, or complicated NBT schemas.
- **Server-Side Compatible**:
  - Functions on dedicated servers without forcing connecting players to have the mod installed on their clients!
  - Fully compatible with singleplayer worlds as well.
- **Zero Bloat & Peak Performance**: Simple, precise bytecode injections via Mixin (`EnderChestBlock` and `PlayerEnderChestContainer`).

---

## 📥 Downloadable Jars

Pre-compiled releases are kept directly in the [`outputs/`](outputs/) folder for quick access:

| Minecraft Version | Download File | Notes |
| :--- | :--- | :--- |
| **Minecraft 26.3** | [`outputs/biggerenderchest-26.3-0.1.0+mc26.3.jar`](outputs/biggerenderchest-26.3-0.1.0+mc26.3.jar) | Latest release built for Minecraft 26.3 |
| **Minecraft 26.2** | [`outputs/biggerenderchest-26.2-0.1.0+mc26.2.jar`](outputs/biggerenderchest-26.2-0.1.0+mc26.2.jar) | Release for Minecraft 26.2 |

You can also find all official releases across 1.16 through 26.x on [Modrinth](https://modrinth.com/mod/bigger-ender-chest).

---

## 🛠️ Requirements & Installation

1. Install [Fabric Loader](https://fabricmc.net/use/installer/) (version `0.15.0` or higher).
2. Download and place the matching version of [Fabric API](https://modrinth.com/mod/fabric-api) into your `.minecraft/mods` directory (or server `mods` directory).
3. Download the matching **Bigger Ender Chest** `.jar` from [`outputs/`](outputs/) or [Modrinth](https://modrinth.com/mod/bigger-ender-chest) and place it into the `mods` folder.
4. Launch the game and enjoy expanded Ender Chest storage!

---

## ⚠️ Important World Management Notes

- **Preservation**: Installing this mod on an existing world will keep your existing 27-slot items intact in the top 3 rows.
- **Downgrading / Removal**: If you decide to uninstall the mod later, items placed in the extra 27 slots (rows 4 to 6) will not be visible in vanilla Minecraft. Always keep backups of your world before adding or removing inventory-modifying mods.

---

## 🔨 Building From Source

This project uses [Stonecutter](https://github.com/kikugie/stonecutter) with Gradle to support multiple Minecraft target versions.

### Prerequisites
- JDK 25+ (for modern Minecraft 26.x targets) or JDK 21

### Build Instructions

```bash
# Clone the repository
git clone https://github.com/antaripnandi/bigger-ender-chest.git
cd bigger-ender-chest

# Build for Minecraft 26.3 and copy the jar to outputs/
./gradlew :26.3:build :26.3:copyBuiltJarToOutputs

# Build for Minecraft 26.2 and copy the jar to outputs/
./gradlew :26.2:build :26.2:copyBuiltJarToOutputs
```

The compiled jars will be placed into the `outputs/` directory.

---

## 📄 License

This project is licensed under the **[MIT License](LICENSE)**.