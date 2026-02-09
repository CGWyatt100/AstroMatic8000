# 🚀 AstroMatic 8000

**Interstellar Vending Solutions by Umbrella Corp**

The AstroMatic 8000 is a zero-gravity vending machine system designed for astronauts on deep-space missions. Connected to the Galactic Bank Network, it allows crew members to purchase cosmic provisions using digital Credits (CR) via their onboard communication devices.

## ✨ Features

### Core Functionality
- **Supply Types**: Dispenses drinks, candy, chips, and gum
- **Digital Currency**: Transactions using Credits (CR), mimicking US currency
- **Auto-Restock**: Automatically restocks to maximum capacity (5 units per slot) on startup
- **Zero-Gravity Compatible**: Designed for space station environments

### Command Console
Interactive menu system with the following options:
1. View Supply Manifest
2. Initiate Purchase
3. Exit

### Transaction Protocol
- **Upload Credits**: Accept whole-Credit increments from the Galactic Bank Network
- **Select Provision**: Choose items by slot code (e.g., A1, B2)
- **Smart Change Return**: Returns change in optimal denominations (quarters, dimes, nickels)
- **Real-time Balance Tracking**: Displays current Credits available throughout transaction

### Item-Specific Dispensing Messages
Each provision type has a unique dispensing message:
- 🥤 **Drinks**: "Glug Glug, Zero-G Sip!"
- 🍟 **Chips**: "Crunch Crunch, Out of this Galaxy!"
- 🍬 **Candy**: "Munch Munch, Stellar!"
- 🍡 **Gum**: "Chew Chew, Cosmic!"

### Inventory Management
- Reads inventory from `supply_manifest.csv`
- Displays current stock levels for each slot
- Shows "SOLD OUT" for empty slots
- Tracks quantity remaining in real-time

### Logging System
All transactions are recorded in `SpaceLog.txt` with timestamps:
- Credit uploads (FEED CREDITS)
- Item dispensing (DISPENSE)
- Change returns (RETURN CHANGE)

Log format:
```
01/01/2025 12:00:00 Z FEED CREDITS: 5.00 CR 5.00 CR
01/01/2025 12:00:15 Z DISPENSE C1 Stellar Cola 1.25 CR 3.75 CR
01/01/2025 12:01:35 Z RETURN CHANGE: 3.75 CR 0.00 CR
```

### StarMap Sales Report
Hidden reporting feature (option 4) generates sales analytics:
- Sales count per provision
- Total Credits earned
- Timestamp-based report naming: `StarMap_Report_<timestamp>.txt`

## 📋 Requirements

- Java Development Kit (JDK) 8 or higher
- `supply_manifest.csv` file in the project directory

## 🚀 Getting Started

## 📦 Supply Manifest Format

The `supply_manifest.csv` file uses pipe-delimited format:

```
Slot Code|Provision Name|Price (CR)|Category
A1|Cosmic Crisps|3.05|Chip
B1|Lunar Pie|1.80|Candy
B2|Meteor Tails|1.50|Candy
C1|Stellar Cola|1.25|Drink
```

## 🎮 Usage Example

### Viewing Inventory
```
(1) View Supply Manifest
(2) Initiate Purchase
(3) Exit

Please select an option: 1

A1 | Cosmic Crisps | 3.05 CR | Quantity: 5
B1 | Lunar Pie | 1.80 CR | Quantity: 5
B2 | Meteor Tails | 1.50 CR | Quantity: 5
C1 | Stellar Cola | 1.25 CR | SOLD OUT
```

### Making a Purchase
```
(1) View Supply Manifest
(2) Initiate Purchase
(3) Exit

Please select an option: 2

Current Credits Available: 0.00 CR

(1) Upload Credits
(2) Select Provision
(3) Complete Transaction

Please select an option: 1
Enter Credits to upload: 5

Current Credits Available: 5.00 CR
```

## 🧪 Testing

The application is designed with testability in mind:
- I/O operations isolated in minimal classes
- Business logic separated from presentation
- Maximum unit-test coverage achievable

Run tests with your preferred testing framework (JUnit recommended).

## 🌟 Design Principles

- **Separation of Concerns**: I/O isolated for easy testing
- **Single Responsibility**: Each class handles one aspect of functionality
- **DRY (Don't Repeat Yourself)**: Reusable components throughout
- **Clear Abstraction**: Intuitive class and method naming

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 🛸 About Umbrella Corp

*"Providing stellar solutions for interstellar stations since 2024"*

---

**Note**: While the AstroMatic 8000 uses digital Credits, change is returned in quarters, dimes, and nickels for compatibility with legacy Earth-based accounting systems. We know it's quirky, but the Galactic Accounting Federation insisted! 🪙
