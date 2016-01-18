package me.alven.cases.listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class StandardMenu implements Listener {
	Inventory invstand;
	@EventHandler()
	public void onInteract(PlayerInteractEvent e) {
		if(e.getPlayer().getItemInHand() !=null && e.getPlayer().getItemInHand().getType().equals(Material.CHEST)){
			invstand = Bukkit.createInventory(null, 27, "§cMine:GO Case");{
				invstand.setItem(0, emptyspace);
				invstand.setItem(1, emptyspace);
				invstand.setItem(2, emptyspace);
				invstand.setItem(3, emptyspace);
				invstand.setItem(4, emptyspace);
				invstand.setItem(5, emptyspace);
				invstand.setItem(6, emptyspace);
				invstand.setItem(7, emptyspace);
				invstand.setItem(8, emptyspace);
				//-------
				invstand.setItem(9, emptyspace);
				invstand.setItem(10, emptyspace);
				invstand.setItem(11, emptyspace);
				invstand.setItem(12, new ItemStack(Material.AIR));
				invstand.setItem(13, emptyspace);
				invstand.setItem(14, new ItemStack(Material.AIR));
				invstand.setItem(15, emptyspace);
				invstand.setItem(16, emptyspace);
				invstand.setItem(17, emptyspace);
				//-------
				invstand.setItem(18, emptyspace);
				invstand.setItem(19, emptyspace);
				invstand.setItem(20, emptyspace);
				invstand.setItem(21, emptyspace);
				invstand.setItem(22, emptyspace);
				invstand.setItem(23, emptyspace);
				invstand.setItem(24, emptyspace);
				invstand.setItem(25, emptyspace);
				invstand.setItem(26, emptyspace);}
			e.getPlayer().openInventory(invstand);
		}
	}
	
	ItemStack emptyspace = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);{
		ItemMeta im = emptyspace.getItemMeta();
		im.setDisplayName(" ");
		emptyspace.setItemMeta(im);
	}
	
	@EventHandler()
	public void InventoryClick(InventoryClickEvent e) {
		if(e.getInventory().getTitle().contains("§cMine:GO Case"))
			e.getWhoClicked().closeInventory();
	}
}