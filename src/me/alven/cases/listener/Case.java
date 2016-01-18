package me.alven.cases.listener;

import me.alven.cases.Main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Case implements Listener{
	Inventory inv2;
	@EventHandler()
	public void onInter(PlayerInteractEvent e) {
		inv2 = Bukkit.createInventory(null, 27, "§cMine:GO Case");{
			inv2.setItem(0, emptyspace);
			inv2.setItem(1, emptyspace);
			inv2.setItem(2, emptyspace);
			inv2.setItem(3, emptyspace);
			inv2.setItem(4, emptyspace);
			inv2.setItem(5, emptyspace);
			inv2.setItem(6, emptyspace);
			inv2.setItem(7, emptyspace);
			inv2.setItem(8, emptyspace);
		}
		if(e.getPlayer().getItemInHand() !=null && e.getPlayer().getItemInHand().getType().equals(Material.DIRT))
			e.getPlayer().openInventory(inv2);

		Main.getInst().getServer().getScheduler().scheduleSyncDelayedTask(Main.getInst(), new Runnable(){
		    public void run(){
		        inv2.setItem(2, new ItemStack(Material.DIRT, 1));;
		    }
		},5*20);
		
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