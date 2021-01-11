package com.magicanexus.edcoapp.models

data class Scoreboard(
    val _internal: Internal,
    val games: List<Game>,
    val numGames: Int
) {
    data class Internal(
        val consolidatedDomKey: String,
        val endToEndTimeMillis: String,
        val igorPath: String,
        val pubDateTime: String,
        val routeName: String,
        val routeValue: String,
        val xslt: String,
        val xsltCompileTimeMillis: String,
        val xsltForceRecompile: String,
        val xsltInCache: String,
        val xsltTransformTimeMillis: String
    )

    data class Game(
        val arena: Arena,
        val attendance: String,
        val clock: String,
        val endTimeUTC: String,
        val extendedStatusNum: Int,
        val gameDuration: GameDuration,
        val gameId: String,
        val gameUrlCode: String,
        val hTeam: HTeam,
        val hasGameBookPdf: Boolean,
        val homeStartDate: String,
        val homeStartTime: String,
        val isBuzzerBeater: Boolean,
        val isGameActivated: Boolean,
        val isNeutralVenue: Boolean,
        val isPreviewArticleAvail: Boolean,
        val isRecapArticleAvail: Boolean,
        val isStartTimeTBD: Boolean,
        val leagueName: String,
        val nugget: Nugget,
        val period: Period,
        val seasonStageId: Int,
        val seasonYear: String,
        val startDateEastern: String,
        val startTimeEastern: String,
        val startTimeUTC: String,
        val statusNum: Int,
        val tickets: Tickets,
        val vTeam: VTeam,
        val visitorStartDate: String,
        val visitorStartTime: String,
        val watch: Watch
    ) {
        data class Arena(
            val city: String,
            val country: String,
            val isDomestic: Boolean,
            val name: String,
            val stateAbbr: String
        )

        data class GameDuration(
            val hours: String,
            val minutes: String
        )

        data class HTeam(
            val linescore: List<Linescore>,
            val loss: String,
            val score: String,
            val seriesLoss: String,
            val seriesWin: String,
            val teamId: String,
            val triCode: String,
            val win: String
        ) {
            data class Linescore(
                val score: String
            )
        }

        data class Nugget(
            val text: String
        )

        data class Period(
            val current: Int,
            val isEndOfPeriod: Boolean,
            val isHalftime: Boolean,
            val maxRegular: Int,
            val type: Int
        )

        data class Tickets(
            val desktopWeb: String,
            val leagGameInfo: String,
            val leagTix: String,
            val mobileApp: String,
            val mobileWeb: String
        )

        data class VTeam(
            val linescore: List<Linescore>,
            val loss: String,
            val score: String,
            val seriesLoss: String,
            val seriesWin: String,
            val teamId: String,
            val triCode: String,
            val win: String
        ) {
            data class Linescore(
                val score: String
            )
        }

        data class Watch(
            val broadcast: Broadcast
        ) {
            data class Broadcast(
                val audio: Audio,
                val broadcasters: Broadcasters,
                val video: Video
            ) {
                data class Audio(
                    val hTeam: HTeam,
                    val national: National,
                    val vTeam: VTeam
                ) {
                    data class HTeam(
                        val broadcasters: List<Broadcaster>,
                        val streams: List<Stream>
                    ) {
                        data class Broadcaster(
                            val longName: String,
                            val shortName: String
                        )

                        data class Stream(
                            val isOnAir: Boolean,
                            val language: String,
                            val streamId: String
                        )
                    }

                    data class National(
                        val broadcasters: List<Any>,
                        val streams: List<Stream>
                    ) {
                        data class Stream(
                            val isOnAir: Boolean,
                            val language: String,
                            val streamId: String
                        )
                    }

                    data class VTeam(
                        val broadcasters: List<Broadcaster>,
                        val streams: List<Stream>
                    ) {
                        data class Broadcaster(
                            val longName: String,
                            val shortName: String
                        )

                        data class Stream(
                            val isOnAir: Boolean,
                            val language: String,
                            val streamId: String
                        )
                    }
                }

                data class Broadcasters(
                    val canadian: List<Canadian>,
                    val hTeam: List<HTeam>,
                    val national: List<National>,
                    val spanish_hTeam: List<Any>,
                    val spanish_national: List<Any>,
                    val spanish_vTeam: List<Any>,
                    val vTeam: List<VTeam>
                ) {
                    data class Canadian(
                        val longName: String,
                        val shortName: String
                    )

                    data class HTeam(
                        val longName: String,
                        val shortName: String
                    )

                    data class National(
                        val longName: String,
                        val shortName: String
                    )

                    data class VTeam(
                        val longName: String,
                        val shortName: String
                    )
                }

                data class Video(
                    val canPurchase: Boolean,
                    val deepLink: List<DeepLink>,
                    val isLeaguePass: Boolean,
                    val isMagicLeap: Boolean,
                    val isNBAOnTNTVR: Boolean,
                    val isNationalBlackout: Boolean,
                    val isNextVR: Boolean,
                    val isOculusVenues: Boolean,
                    val isTNTOT: Boolean,
                    val isVR: Boolean,
                    val regionalBlackoutCodes: String,
                    val streams: List<Stream>,
                    val tntotIsOnAir: Boolean
                ) {
                    data class DeepLink(
                        val androidApp: String,
                        val broadcaster: String,
                        val desktopWeb: String,
                        val iosApp: String,
                        val mobileWeb: String,
                        val regionalMarketCodes: String
                    )

                    data class Stream(
                        val doesArchiveExist: Boolean,
                        val duration: Int,
                        val isArchiveAvailToWatch: Boolean,
                        val isOnAir: Boolean,
                        val streamId: String,
                        val streamType: String
                    )
                }
            }
        }
    }
}