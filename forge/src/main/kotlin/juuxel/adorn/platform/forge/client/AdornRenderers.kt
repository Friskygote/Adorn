package juuxel.adorn.platform.forge.client

import juuxel.adorn.block.AdornBlockEntities
import juuxel.adorn.block.AdornBlocks
import juuxel.adorn.client.SinkColorProvider
import juuxel.adorn.client.renderer.InvisibleEntityRenderer
import juuxel.adorn.client.renderer.ShelfRenderer
import juuxel.adorn.client.renderer.TradingStationRenderer
import juuxel.adorn.entity.AdornEntities
import net.minecraft.client.render.RenderLayer
import net.minecraft.client.render.RenderLayers
import net.minecraftforge.client.event.ColorHandlerEvent
import net.minecraftforge.client.event.EntityRenderersEvent

object AdornRenderers {
    fun registerRenderers(event: EntityRenderersEvent.RegisterRenderers) {
        event.registerEntityRenderer(AdornEntities.SEAT, ::InvisibleEntityRenderer)
        event.registerBlockEntityRenderer(AdornBlockEntities.TRADING_STATION, ::TradingStationRenderer)
        event.registerBlockEntityRenderer(AdornBlockEntities.SHELF, ::ShelfRenderer)
    }

    fun registerRenderLayers() {
        val renderLayers = mapOf(
            RenderLayer.getCutout() to arrayOf(
                AdornBlocks.TRADING_STATION,
                AdornBlocks.STONE_TORCH_GROUND,
                AdornBlocks.STONE_TORCH_WALL,
                AdornBlocks.CHAIN_LINK_FENCE,
                AdornBlocks.STONE_LADDER,
            ),
            RenderLayer.getTranslucent() to arrayOf(
                AdornBlocks.OAK_COFFEE_TABLE,
                AdornBlocks.SPRUCE_COFFEE_TABLE,
                AdornBlocks.BIRCH_COFFEE_TABLE,
                AdornBlocks.JUNGLE_COFFEE_TABLE,
                AdornBlocks.ACACIA_COFFEE_TABLE,
                AdornBlocks.DARK_OAK_COFFEE_TABLE,
                AdornBlocks.CRIMSON_COFFEE_TABLE,
                AdornBlocks.WARPED_COFFEE_TABLE,
            )
        )

        for ((layer, blocks) in renderLayers) {
            for (block in blocks) {
                RenderLayers.setRenderLayer(block, layer)
            }
        }
    }

    fun registerColorProviders(event: ColorHandlerEvent.Block) {
        event.blockColors.registerColorProvider(
            SinkColorProvider,
            AdornBlocks.OAK_KITCHEN_SINK,
            AdornBlocks.SPRUCE_KITCHEN_SINK,
            AdornBlocks.BIRCH_KITCHEN_SINK,
            AdornBlocks.JUNGLE_KITCHEN_SINK,
            AdornBlocks.ACACIA_KITCHEN_SINK,
            AdornBlocks.DARK_OAK_KITCHEN_SINK,
            AdornBlocks.CRIMSON_KITCHEN_SINK,
            AdornBlocks.WARPED_KITCHEN_SINK,
        )
    }
}
