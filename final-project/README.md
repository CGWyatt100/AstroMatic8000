# Module 1 Final Project - Space Explorer Vending Machine

You're developing software for the latest interstellar vending machine from Umbrella Corp. They've launched the **Astro-Matic 8000**, a zero‑gravity dispenser connected to the Galactic Bank Network, allowing astronauts to purchase cosmic provisions/products using digital Credits (CR) -(mimics US currency) via their onboard comm devices.

---

## Application Requirements

1. **Supply Types**: The vending machine dispenses drinks, candy, chips, and gum.
   - Each provision/product has a **Name** and a **Price** in Credits.
2. **Command Console (main menu)**: On startup, display:
   ```
   (1) View Supply Manifest
   (2) Initiate Purchase
   (3) Exit
   ```
3. **Supply Manifest**: Read inventory from a supply file (`supply_manifest.csv`) at boot.
4. **Auto‑Restock**: The vending machine is automatically restocked each time the application runs. all slots are reset to maximum capacity (5 units each).
5. **View Supply Manifest** (`1`): List every slot and its current stock/quantity remaining:
   - Slots are identified by codes (e.g., A1, B2).
   - Show **SOLD OUT** for empty slots.
6. **Initiate Purchase** (`2`) enters the **Transaction Protocol menu**:
   ```
   Current Credits Available: 2.00 CR

   (1) Upload Credits
   (2) Select Provision
   (3) Complete Transaction
   ```
7. **Transaction Protocol Flow**:
   1. **Upload Credits** (`1`)
      - Accept whole‑Credit increments from the Galactic Bank Network.
      - Update and display **Current Credits Available**.
   2. **Select Provision** (`2`)
      - Show manifest provisions/products and prompt for a slot code.
      - Invalid code → alert and return to Transaction Protocol menu.
      - SOLD OUT → alert and return.
      - Valid selection → dispense item, deduct cost, display remaining Credits, and display a message:
        - **All drink items print**: “Glug Glug, Zero‑G Sip!”
        - **All chip items print**: “Crunch Crunch, Out of this Galaxy!”
        - **All candy items print**: “Munch Munch, Stellar!”
        - **All gum items print**: “Chew Chew, Cosmic!”
   3. **Complete Transaction** (`3`)
      - Return change in digital quarters, dimes, and nickels (minimize coin count). - yes, I know ;)
      - Reset **Current Credits Available** to `0.00 CR`.
   4. After completion, return to **Command Console (main menu)**.
8. **Vending Machine Logs**: Record every credit upload, dispense, and change return to `SpaceLog.txt`:
   - Format:
     ```text
     01/01/2025 12:00:00 Z FEED CREDITS: 5.00 CR 5.00 CR
     01/01/2025 12:00:15 Z DISPENSE C1 Stellar Cola 1.25 CR 3.75 CR
     01/01/2025 12:01:35 Z RETURN CHANGE: 3.75 CR 0.00 CR
     ```
   - the second CR amount is the new balance available.

9. **Testable Design**: Maximize unit‑test coverage by isolating I/O in as few classes as possible.

---

## Supply Manifest File

The machine loads its manifest from a pipe‑delimited CSV. Each line details one provision:

| Slot Code | Provision Name  | Price (CR) | Category |
| --------- | --------------- | ---------- | -------- |
| A1        | Cosmic Crisps   | 3.05       | Chip     |
| B1        | Lunar Pie       | 1.80       | Candy    |
| B2        | Meteor Tails    | 1.50       | Candy    |
| C1        | Stellar Cola    | 1.25       | Drink    |

An input manifest file is in your repository as `supply_manifest.csv`.

---

## StarMap Sales Report

10. Include a hidden **(4)** option on the Command Console to generate a StarMap Report (`StarMap_Report_<timestamp>.txt`) showing sales counts per provision and total Credits earned:

```text
Stellar Cola|2
Cosmic Crisps|1
Meteor Tails|0
Galaxy Gum|3

**TOTAL CREDITS** 7.80 CR
```

---

## Unit Testing

Provide unit tests to verify:

- Accurate loading and parsing of `supply_manifest.csv`.
- Correct stock restocking logic.
- Payment processing, dispense behavior, and change calculation.
- Flight Log (`SpaceLog.txt`) entries.

---

Safe travels, astronauts! May your Credits be plentiful and your snacks out of this world. 🚀

