package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



    public class Inventory {

        public static final String SUPPLY_MANIFEST = "supply_manifest.csv";
        private static Map<String, Products> inventory = new HashMap<>();


        public Inventory(String SUPPLY_MANIFEST) throws IOException {
            loadManifest(SUPPLY_MANIFEST);
        }
        private void loadManifest(String SUPPLY_MANIFEST) throws IOException {
            Scanner scanner = new Scanner(new File(SUPPLY_MANIFEST));
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            String slotCode = null;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("|");
                //if (parts.length < 5) {
                // continue;
                //}

                slotCode = parts[0];
                String name = parts[1];
                String provisionType = parts[2];
                double price = Double.parseDouble(parts[3]);
                int quantity = Integer.parseInt(parts[4]);

                inventory.put(slotCode, new Products(slotCode, name, price, provisionType, quantity));
            }

            if (!inventory.containsKey(slotCode)) {
                System.out.println("Invalid code. Returning to menu.");
                return;
            }

            Products product = inventory.get(slotCode);
            if (product.isSoldOut()) {
                System.out.println("SOLD OUT. Returning to menu.");
                return;
            }



        }
    }



