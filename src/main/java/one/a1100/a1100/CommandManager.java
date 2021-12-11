package one.a1100.a1100;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;


public class CommandManager implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, Command command, @NotNull String label, String[] arg) {
        if(command.getName().equals("a1100a")) {
            if(sender instanceof Player player) {
                sender.sendMessage(net.md_5.bungee.api.ChatColor.of("#F0263E") + "asdf\n" + sender.getName() + "\n" + sender.getServer());
                ItemStack elytra = new ItemStack(Material.ELYTRA);
                ItemMeta elytraMeta = elytra.getItemMeta();
                elytraMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 32767, true);
                elytraMeta.setUnbreakable(true);
                elytra.setItemMeta(elytraMeta);
                player.getInventory().setChestplate(elytra);
                player.getInventory().setHelmet(elytra);
                player.getInventory().setLeggings(elytra);
                player.getInventory().setBoots(elytra);
                return true;
            }
            else if(sender instanceof ConsoleCommandSender) {
                sender.sendMessage("콘솔에서는 이 명령어를 사용할 수 없습니다.");
                return false;
            }

        }
        return false;
    }
}
