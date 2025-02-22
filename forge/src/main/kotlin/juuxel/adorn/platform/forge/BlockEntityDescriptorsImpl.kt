package juuxel.adorn.platform.forge

import juuxel.adorn.block.DrawerBlock
import juuxel.adorn.block.KitchenCupboardBlock
import juuxel.adorn.block.ShelfBlock
import juuxel.adorn.block.TradingStationBlock
import juuxel.adorn.block.entity.BlockEntityDescriptor
import juuxel.adorn.block.entity.DrawerBlockEntity
import juuxel.adorn.block.entity.KitchenCupboardBlockEntity
import juuxel.adorn.block.entity.ShelfBlockEntity
import juuxel.adorn.block.entity.TradingStationBlockEntity
import juuxel.adorn.platform.BlockEntityDescriptors
import juuxel.adorn.platform.forge.block.entity.ShelfBlockEntityForge
import juuxel.adorn.platform.forge.block.entity.TradingStationBlockEntityForge

object BlockEntityDescriptorsImpl : BlockEntityDescriptors {
    override fun shelf(): BlockEntityDescriptor<ShelfBlock, ShelfBlockEntity> =
        BlockEntityDescriptor(::ShelfBlockEntityForge)

    override fun drawer(): BlockEntityDescriptor<DrawerBlock, DrawerBlockEntity> =
        BlockEntityDescriptor(::DrawerBlockEntity)

    override fun kitchenCupboard(): BlockEntityDescriptor<KitchenCupboardBlock, KitchenCupboardBlockEntity> =
        BlockEntityDescriptor(::KitchenCupboardBlockEntity)

    override fun tradingStation(): BlockEntityDescriptor<TradingStationBlock, TradingStationBlockEntity> =
        BlockEntityDescriptor(::TradingStationBlockEntityForge)
}
